package com.example.deadline;

import com.google.firebase.database.IgnoreExtraProperties;

import java.sql.Struct;
import java.util.List;

@IgnoreExtraProperties
public class User {

    private UserInformation userinfo;
    private List<Quest> quests;

    public User(){
        // Default Constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(UserInformation userinfo, List<Quest> quests)
    {
        this.userinfo = userinfo;
        this.quests = quests;
    }

    public UserInformation getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserInformation userinfo) {
        this.userinfo = userinfo;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }

    @Override
    public String toString()
    {
        return "Personal Information: "+ this.userinfo +" , Quests: " + this.quests;
    }

//    public CreateStat()
//    {
//
//    }
}
