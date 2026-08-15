package com.example.aicareer.dto;

import java.util.List;

public class CareerResponse {

    /**
     * 職務経歴の要約
     */
    private String summary;

    /**
     * 技術的な強み
     */
    private List<String> strengths;

    /**
     * 面接でアピールすべきポイント
     */
    private List<String> interviewPoints;

    /**
     * 今後伸ばすべきスキル
     */
    private List<String> recommendedSkills;

    /**
     * Jackson用のデフォルトコンストラクタ
     */
    public CareerResponse() {
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<String> strengths) {
        this.strengths = strengths;
    }

    public List<String> getInterviewPoints() {
        return interviewPoints;
    }

    public void setInterviewPoints(List<String> interviewPoints) {
        this.interviewPoints = interviewPoints;
    }

    public List<String> getRecommendedSkills() {
        return recommendedSkills;
    }

    public void setRecommendedSkills(List<String> recommendedSkills) {
        this.recommendedSkills = recommendedSkills;
    }

    @Override
    public String toString() {
        return "CareerResponse{" +
                "summary='" + summary + '\'' +
                ", strengths=" + strengths +
                ", interviewPoints=" + interviewPoints +
                ", recommendedSkills=" + recommendedSkills +
                '}';
    }
}