package com.example.deadline;

public class Level {

    private String levelName;
    private int levelNumber;
    private int pointsNeededtoLevelUp;

    public Level() {

    }

    public Level(String levelName, int levelNumber, int pointsNeededtoLevelUp)
    {
        this.levelName = levelName;
        this.levelNumber = levelNumber;
        this.pointsNeededtoLevelUp = pointsNeededtoLevelUp;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public int getPointsNeededtoLevelUp() {
        return pointsNeededtoLevelUp;
    }

    public void setPointsNeededtoLevelUp(int pointsNeededtoLevelUp) {
        this.pointsNeededtoLevelUp = pointsNeededtoLevelUp;
    }

    @Override
    public String toString()
    {
        return "Level Name: "+ this.levelNumber +" , Level Number: " + this.levelNumber + " , Points Needed: " + this.pointsNeededtoLevelUp;
    }

}
