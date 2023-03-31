package main.java.Character;

import java.util.ArrayList;
import java.util.List;

public class Wizzard extends Character {
    private String wizzardname;
    private Pet pet;
    private Wand wand;
    private House house;
    private List<PotionType> potions;
    private List<Spell> masteredspell;
    private int coins;
    private static final int MAX_POTIONS = 5;

    public Wizzard(String wizzardname, Pet pet, Wand wand, House house, List<PotionType> potions, int coins,
            int lifepoint, double damagereseitancebonus, double damageresitance, double defance,
            double damagebonus, int spelldamage, int potionbonus, int precision, int precisionsto, int precisionbonus,
            double damage, List<Spell> masteredspell) {
        super(lifepoint, damagereseitancebonus, damageresitance, defance, damagebonus, spelldamage, potionbonus,
                precision,
                precisionsto, precisionbonus, damage);
        this.wizzardname = wizzardname;
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.potions = potions;
        this.coins = coins;
        this.potions = new ArrayList<>();
        this.masteredspell = new ArrayList<>();

    }

    public int getCoins() {
        return coins;
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
        return potions;
    }

    public void setPotions(List<PotionType> potions) {
        this.potions = potions;
    }

    public int size() {
        return potions.size();
    }

    public boolean contains(PotionType potion) {
        for (PotionType p : potions) {
            if (p.name().equals(potion.name())) {
                return true;
            }
        }
        return false;
    }

    public void add(PotionType potion) {
        if (potions.size() < MAX_POTIONS && !contains(potion)) {
            potions.add(potion);
            System.out.println("Added " + potion.name() + " to " + wizzardname + "'s potions!");
        } else if (potions.size() >= MAX_POTIONS) {
            System.out.println(wizzardname + "'s potion bag is already full!");
        } else {
            System.out.println(wizzardname + " already has " + potion.name() + " in their potion bag!");
        }
    }

    public List<Spell> getMasteredSpells() {
        return masteredspell;
    }

    public void addMasteredSpell(EnumSpell spell) {
        if (spell != null && !ForbiddenSpell.isForbidden(spell)) {
            masteredspell.add(new Spell(spell));
        } else {
            System.out.println("You cannot master this spell.");
        }
    }

    public void addMasteredSpell(Spell spell) {
        if (spell != null && !ForbiddenSpell.isForbidden(spell.getSpell())) {
            masteredspell.add(spell);
        } else {
            System.out.println("You cannot master this spell.");
        }
    }
}
