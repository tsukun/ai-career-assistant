package com.example.aicareer.controller;

import com.example.aicareer.dto.CareerRequest;
import com.example.aicareer.dto.CareerResponse;
import com.example.aicareer.dto.FactExtractionResponse;
import com.example.aicareer.service.OllamaService;
import jakarta.validation.Valid;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Controller
public class CareerController {

    private final OllamaService ollamaService;

    public CareerController(OllamaService ollamaService) {
        this.ollamaService = ollamaService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/api/analyze")
    @ResponseBody
    public CareerResponse analyze(
            @Valid @RequestBody CareerRequest request) {

        return ollamaService.analyzeCareer(
                request.getCareer()
        );
    }

    @GetMapping("/api/ollama-test")
    @ResponseBody
    public String ollamaTest() {

        return ollamaService.ask(
                "日本語で簡単に自己紹介してください。"
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<String> handleValidationException(
            MethodArgumentNotValidException e) {

        String message = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .findFirst()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .orElse("入力内容に誤りがあります。");

        return ResponseEntity
                .badRequest()
                .body(message);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<String> handleException(Exception e) {

        System.err.println("AI分析中にエラーが発生しました:");
        e.printStackTrace();

        return ResponseEntity
                .internalServerError()
                .body("AI分析中にエラーが発生しました。Ollamaが起動しているか確認してください。");
    }

    @PostMapping("/api/facts")
    @ResponseBody
    public FactExtractionResponse extractFacts(
            @Valid @RequestBody CareerRequest request) {

        return ollamaService.extractFacts(
                request.getCareer()
        );
    }
}