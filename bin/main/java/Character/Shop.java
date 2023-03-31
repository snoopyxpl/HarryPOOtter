/*
 * Decompiled with CFR 0.152.
 */
package main.java.Character;

import java.util.ArrayList;
import java.util.List;
import main.java.Character.Potion;

public class Shop {
    private List<Potion> potions = new ArrayList<Potion>();

    public Shop(List<Potion> potions) {
    }

    public List<Potion> getPotions() {
        return this.potions;
    }

    public void setPotions(List<Potion> potions) {
        this.potions = potions;
    }
}
