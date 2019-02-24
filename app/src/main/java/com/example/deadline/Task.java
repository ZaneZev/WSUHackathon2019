package com.example.deadline;

public class Task {

    private String name;
    private int rewardPoints;

    public Task()
    {

    }

    public Task(String name, int rewardAmount)
    {
        this.name = name;
        this.rewardPoints = rewardAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    @Override
    public String toString()
    {
        return "Reward Name: "+ this.name +" , Reward Points: " + this.rewardPoints;
    }

}
