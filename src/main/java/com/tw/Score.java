package com.tw;

public class Score {
    private String name;
    private int number;
    private int mathScore;
    private int chineseScore;
    private int englishScore;
    private int programmingScore;

    public Score(String name, int number, int mathScore, int chineseScore, int englishScore, int programmingScore) {
        this.name = name;
        this.number = number;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
        this.programmingScore = programmingScore;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
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
}