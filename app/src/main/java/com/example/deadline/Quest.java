package com.example.deadline;


import java.util.List;

public class Quest {

    private String questName;
    private List<Level> levels;
    private List<Task> tasks;
    private int totalNumberOfPoints;

    public Quest()
    {

    }

    public Quest(String questName, List<Level> levels, List<Task> tasks, int totalNumberOfPoints)
    {
        this.questName = questName;
        this.levels = levels;
        this.tasks = tasks;
        this.totalNumberOfPoints = totalNumberOfPoints;
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public int getTotalNumberOfPoints() {
        return totalNumberOfPoints;
    }

    public void setTotalNumberOfPoints(int totalNumberOfPoints) {
        this.totalNumberOfPoints = totalNumberOfPoints;
    }

    @Override
    public String toString()
    {
        return "Quest Name: "+ this.questName+ " , Levels: " + this.levels + " , Tasks: " + this.tasks + " , Total Points: " + this.totalNumberOfPoints;
    }


}
