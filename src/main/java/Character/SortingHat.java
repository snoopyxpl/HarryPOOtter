package main.java.Character;

import java.util.Random;

public class SortingHat {

    public static void assignHouse(Wizzard wizzard) {
        Random random = new Random();
        HouseName[] houses = HouseName.values();
        int index = random.nextInt(houses.length);
        HouseName houseName = houses[index];
        House house = new House(houseName);
        wizzard.setHouse(house);
        assignBonus(wizzard);
    }

    public static void assignBonus(Wizzard wizzard) {
        House house = wizzard.getHouse();
        switch (house.getName()) {
            case GRYFFINDOR:
                wizzard.setDamagereseitancebonus(1.25);
                break;
            case HUFFLEPUFF:
                wizzard.setPotionbonus(30);
                break;
            case RAVENCLAW:
                wizzard.setPrecisionbonus(25);
                break;
            case SLYTHERIN:
                wizzard.setDamagebonus(1.25);
                break;
            default:
                break;
        }
    }
}
