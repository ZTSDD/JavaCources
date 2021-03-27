package com.vventerprise.Task2;

public class Vehicle extends MilitaryUnit {
    public VehicleType Type;
    public int Speed;
    public int Capacity;

    public  Vehicle(String callSign, VehicleType type, int speed, int capacity){
        super(callSign);
        Type = type;
        Speed = speed;
        Capacity = capacity;
    }

    @Override
    public void Attack() {
        System.out.println(CallSign + ", еду своими " +
                (Type == VehicleType.Tracked ? "гусеницами" : "колесами") +
                " по вражине на скорости " + Speed +
                "и во мне " + Capacity + " солдат!");
    }
}
