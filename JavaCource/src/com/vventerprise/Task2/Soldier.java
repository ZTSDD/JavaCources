package com.vventerprise.Task2;

public class Soldier extends MilitaryUnit {
    public String Rank;
    public int Age;

    public Soldier(String callSign, String rank, int age) {
        super(callSign);
        Rank = rank;
        Age = age;
    }

    @Override
    public void Attack() {
        System.out.println(Rank + " " + super.CallSign + ", бегу бить всех автоматом! У меня" + Age + " выслуги лет!!!");
    }
}
