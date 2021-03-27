package com.vventerprise.Task2;

public abstract class MilitaryUnit {
    public String CallSign;

    public MilitaryUnit(String callSign){
        CallSign = callSign;
    }

    public abstract void Attack();

}
