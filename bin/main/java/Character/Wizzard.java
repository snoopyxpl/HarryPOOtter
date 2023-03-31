/*
 * Decompiled with CFR 0.152.
 */
package main.java.Character;

import java.util.ArrayList;
import java.util.List;
import main.java.Character.Character;
import main.java.Character.EnumSpell;
import main.java.Character.ForbiddenSpell;
import main.java.Character.House;
import main.java.Character.Pet;
import main.java.Character.PotionType;
import main.java.Character.Spell;
import main.java.Character.Wand;

public class Wizzard
extends Character {
    private String wizzardname;
    private Pet pet;
    private Wand wand;
    private House house;
    private List<PotionType> potions;
    private List<Spell> masteredspell;
    private int coins;
    private static final int MAX_POTIONS = 5;

    public Wizzard(String wizzardname, Pet pet, Wand wand, House house, List<PotionType> potions, int coins, int lifepoint, double damagereseitancebonus, double damageresitance, double defance, double damagebonus, int spelldamage, int potionbonus, int precision, int precisionsto, int precisionbonus, double damage, List<Spell> masteredspell) {
        super(lifepoint, damagereseitancebonus, damageresitance, defance, damagebonus, spelldamage, potionbonus, precision, precisionsto, precisionbonus, damage);
        this.wizzardname = wizzardname;
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.potions = potions;
        this.coins = coins;
        this.potions = new ArrayList<PotionType>();
        this.masteredspell = new ArrayList<Spell>();
    }

    public int getCoins() {
        return this.coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public String getWizzardname() {
        return this.wizzardname;
    }

    public void setWizzardname(String wizzardname) {
        this.wizzardname = wizzardname;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public House getHouse() {
        return this.house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public List<PotionType> getPotions() {
        return this.potions;
    }

    public void setPotions(List<PotionType> potions) {
        this.potions = potions;
    }

    public int size() {
        return this.potions.size();
    }

    public boolean contains(PotionType potion) {
        for (PotionType p : this.potions) {
            if (!p.getName().equals(potion.getName())) continue;
            return true;
        }
        return false;
    }

    public void add(PotionType potion) {
        if (this.potions.size() < 5 && !this.contains(potion)) {
            this.potions.add(potion);
            System.out.println("Added " + potion.getName() + " to " + this.wizzardname + "'s potions!");
        } else if (this.potions.size() >= 5) {
            System.out.println(String.valueOf(this.wizzardname) + "'s potion bag is already full!");
        } else {
            System.out.println(String.valueOf(this.wizzardname) + " already has " + potion.getName() + " in their potion bag!");
        }
    }

    public List<Spell> getMasteredSpells() {
        return this.masteredspell;
    }

    public void addMasteredSpell(EnumSpell spell) {
        if (spell != null && !ForbiddenSpell.isForbidden(spell)) {
            this.masteredspell.add(new Spell(spell));
        } else {
            System.out.println("You cannot master this spell.");
        }
    }

    public void addMasteredSpell(Spell spell) {
        if (spell != null && !ForbiddenSpell.isForbidden(spell.getSpell())) {
            this.masteredspell.add(spell);
        } else {
            System.out.println("You cannot master this spell.");
        }
    }
}
