package com.vventerprise.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MilitaryUnit> army = new ArrayList<MilitaryUnit>(){{
            add(new Soldier("Джек", "Капрал", 15));
            add(new Vehicle("Громадина", VehicleType.Wheeled, 100, 8));
            add(new Vehicle("Давила", VehicleType.Tracked, 35, 16));
            add(new Helicopter("Летяга", true));
        }};

        for (MilitaryUnit unit : army){
            unit.Attack();
        }
    }
}
