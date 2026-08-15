package com.example.aicareer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CareerRequest {

    @NotBlank(message = "職務経歴を入力してください")
    @Size(max = 10000, message = "職務経歴は10000文字以内で入力してください")
    private String career;

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}