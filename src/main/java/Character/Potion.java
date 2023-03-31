package main.java.Character;

import java.util.ArrayList;
import java.util.List;

public class Potion {
    private final EnumPotion potionType;

    public Potion(EnumPotion potionType) {
        this.potionType = potionType;
    }

    public String GetName() {
        return potionType.getName();
    }

    public int GetPrice() {
        return potionType.getPrice();
    }

    public int GetValue() {
        return potionType.getValue();
    }

    public PotionType GetPotionType() {
        return potionType.getPotionType();
    }

    public static List<Potion> GetAllPotions() {
        List<Potion> potions = new ArrayList<>();
        for (EnumPotion enumPotion : EnumPotion.values()) {
            potions.add(new Potion(enumPotion));
        }
        return potions;
    }

    public EnumPotion GetPotion() {
        return potionType;
    }

}
