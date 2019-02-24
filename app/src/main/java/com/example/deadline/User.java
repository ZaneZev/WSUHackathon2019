package com.example.deadline;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    public String name;
    public int age;
    public int weight;
   // public Stat myStats;

    public User(){
        // Default Constructor required for calls to DataSnapshot.getValue(User.class)
    }
    public User(String name, int age, int weight)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "name: "+ this.name +" , age " + this.age + " , Weight: " + this.weight;
    }

//    public CreateStat()
//    {
//
//    }
}
