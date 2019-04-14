package com.tw;

public class Score {
    private String name;
    private String number;
    private int mathScore;
    private int chineseScore;
    private int englishScore;
    private int programmingScore;
    private double averageScore;
    private int totalScore;

    public Score(String name, String number, int mathScore, int chineseScore, int englishScore, int programmingScore) {
        this.name = name;
        this.number = number;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
        this.programmingScore = programmingScore;
    }

    public Score(String name, String number, int mathScore, int chineseScore, int englishScore, int programmingScore, double averageScore, int totalScore) {
        this.name = name;
        this.number = number;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
        this.programmingScore = programmingScore;
        this.averageScore = averageScore;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getProgrammingScore() {
        return programmingScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
