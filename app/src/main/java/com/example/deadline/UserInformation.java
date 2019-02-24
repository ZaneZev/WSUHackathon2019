package com.example.deadline;

public class UserInformation {

    private String firstName;
    private String lastName;
    private int age;
    private int weight;

    public UserInformation()
    {

    }

    public UserInformation(String firstName, String lastName, int age, int weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String GetFullName()
    {
        return this.firstName + this.lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    @Override
    public String toString()
    {
        return "Name: "+ this.firstName + " " + this.lastName + " , Age: " + this.age + " , Weight(lbs): " + this.weight;
    }


}
