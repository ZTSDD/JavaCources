package com.vventerprise.Task2;

public class Helicopter extends MilitaryUnit {
    public Boolean HasRockets;

    public Helicopter(String callSign, Boolean hasRockets){
        super(callSign);
        HasRockets = hasRockets;
    }

    @Override
    public void Attack() {
        System.out.println(CallSign + ", лечу косить всех своими лопостями!" + (HasRockets ? " и у меня есть ракеты!" : ""));
    }
}
