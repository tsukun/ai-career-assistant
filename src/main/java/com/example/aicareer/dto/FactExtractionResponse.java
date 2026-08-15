package com.example.aicareer.dto;

import java.util.List;

public class FactExtractionResponse {

    /**
     * 経験年数・経験期間
     */
    private List<String> experienceYears;

    /**
     * 業務内容
     */
    private List<String> businessActivities;

    /**
     * 担当したシステム・プロジェクト
     */
    private List<String> systems;

    /**
     * 担当した工程
     */
    private List<String> processes;

    /**
     * 使用した技術・言語・フレームワーク・製品
     */
    private List<String> technologies;

    /**
     * システム間連携・インターフェース方式
     */
    private List<String> interfaces;

    /**
     * 担当した役割
     */
    private List<String> roles;

    /**
     * 明記された成果
     */
    private List<String> achievements;

    /**
     * 明記された資格
     */
    private List<String> qualifications;

    /**
     * 明記されたチーム規模・人数
     */
    private List<String> teamSize;

    public FactExtractionResponse() {
    }

    public List<String> getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(List<String> experienceYears) {
        this.experienceYears = experienceYears;
    }

    public List<String> getBusinessActivities() {
        return businessActivities;
    }

    public void setBusinessActivities(List<String> businessActivities) {
        this.businessActivities = businessActivities;
    }

    public List<String> getSystems() {
        return systems;
    }

    public void setSystems(List<String> systems) {
        this.systems = systems;
    }

    public List<String> getProcesses() {
        return processes;
    }

    public void setProcesses(List<String> processes) {
        this.processes = processes;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<String> interfaces) {
        this.interfaces = interfaces;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }

    public List<String> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<String> qualifications) {
        this.qualifications = qualifications;
    }

    public List<String> getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(List<String> teamSize) {
        this.teamSize = teamSize;
    }
}