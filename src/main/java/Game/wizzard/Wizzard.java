package main.java.Game.wizzard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import main.java.Game.potions.PotionType;
import main.java.Game.spell.EnumSpell;
import main.java.Game.spell.ForbiddenSpell;
import main.java.Game.spell.Spell;

public class Wizzard {

  private String wizzardname;
  private Pet pet;
  private Wand wand;
  private House house;
  private List<PotionType> potions;
  private List<Spell> masteredspell;
  private int coins;
  private int lifepoint;
  public double damagereseitancebonus;
  public double damageresitance;
  private double defance;
  public double damagebonus;
  private int spelldamage;
  public int potionbonus;
  private int precision;
  private int precisionsto;
  public int precisionbonus;
  private double damage;
  private static final int MAX_POTIONS = 5;

  public Wizzard(
    String wizzardname,
    Pet pet,
    Wand wand,
    House house,
    List<PotionType> potions,
    int coins,
    int lifepoint,
    double damagereseitancebonus,
    double damageresitance,
    double defance,
    double damagebonus,
    int spelldamage,
    int potionbonus,
    int precision,
    int precisionsto,
    int precisionbonus,
    double damage,
    List<Spell> masteredspell
  ) {
    this.lifepoint = lifepoint;
    this.damagereseitancebonus = damagereseitancebonus;
    this.damageresitance = damageresitance;
    this.defance = defance;
    this.damagebonus = damagebonus;
    this.spelldamage = spelldamage;
    this.potionbonus = potionbonus;
    this.precision = precision;
    this.precisionsto = precisionsto;
    this.precisionbonus = precisionbonus;
    this.damage = damage;
    this.wizzardname = wizzardname;
    this.pet = pet;
    this.wand = wand;
    this.house = house;
    this.potions = potions;
    this.coins = coins;
    this.potions = new ArrayList<>();
    this.masteredspell = new ArrayList<>();
  }

  public double getdamage(double damagebonus, Spell spell) {
    double damage = damagebonus * spell.getDamage();
    return damage;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " wizzardname='" +
      getWizzardname() +
      "'" +
      ", pet='" +
      getPet() +
      "'" +
      ", wand='" +
      getWand() +
      "'" +
      ", house='" +
      getHouse() +
      "'" +
      ", potions='" +
      getPotions() +
      "'" +
      ", masteredspell='" +
      getMasteredSpells() +
      "'" +
      ", coins='" +
      getCoins() +
      "'" +
      ", lifepoint='" +
      getLifepoint() +
      "'" +
      ", damagereseitancebonus='" +
      getDamagereseitancebonus() +
      "'" +
      ", damageresitance='" +
      getDamageresitance() +
      "'" +
      ", defance='" +
      getDefance() +
      "'" +
      ", damagebonus='" +
      getDamagebonus() +
      "'" +
      ", spelldamage='" +
      getSpelldamage() +
      "'" +
      ", potionbonus='" +
      getPotionbonus() +
      "'" +
      ", precision='" +
      getPrecision() +
      "'" +
      ", precisionsto='" +
      getPrecisionsto() +
      "'" +
      ", precisionbonus='" +
      getPrecisionbonus() +
      "'" +
      ", damage='" +
      getDamage() +
      "'" +
      "}"
    );
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Wizzard)) {
      return false;
    }
    Wizzard wizzard = (Wizzard) o;
    return (
      Objects.equals(wizzardname, wizzard.wizzardname) &&
      Objects.equals(pet, wizzard.pet) &&
      Objects.equals(wand, wizzard.wand) &&
      Objects.equals(house, wizzard.house) &&
      Objects.equals(potions, wizzard.potions) &&
      Objects.equals(masteredspell, wizzard.masteredspell) &&
      coins == wizzard.coins &&
      lifepoint == wizzard.lifepoint &&
      damagereseitancebonus == wizzard.damagereseitancebonus &&
      damageresitance == wizzard.damageresitance &&
      defance == wizzard.defance &&
      damagebonus == wizzard.damagebonus &&
      spelldamage == wizzard.spelldamage &&
      potionbonus == wizzard.potionbonus &&
      precision == wizzard.precision &&
      precisionsto == wizzard.precisionsto &&
      precisionbonus == wizzard.precisionbonus &&
      damage == wizzard.damage
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      wizzardname,
      pet,
      wand,
      house,
      potions,
      masteredspell,
      coins,
      lifepoint,
      damagereseitancebonus,
      damageresitance,
      defance,
      damagebonus,
      spelldamage,
      potionbonus,
      precision,
      precisionsto,
      precisionbonus,
      damage
    );
  }

  public double getresitance(
    double damagereseitancebonus,
    double damagereseitance
  ) {
    double defance = damagereseitance * damagereseitancebonus;
    return defance;
  }

  public double updatedef(double defance) {
    double damageresitance = defance;
    return damageresitance;
  }

  public int getprecision(int precision, int precisionbonus) {
    int precisionsto = precision + precisionbonus;
    return precisionsto;
  }

  public int updatepres(int precisionsto) {
    int precision = precisionsto;
    return precision;
  }

  public int getLifepoint() {
    return this.lifepoint;
  }

  public void setLifepoint(int lifepoint) {
    this.lifepoint = lifepoint;
  }

  public double getDamagereseitancebonus() {
    return this.damagereseitancebonus;
  }

  public void setDamagereseitancebonus(double damagereseitancebonus) {
    this.damagereseitancebonus = damagereseitancebonus;
  }

  public double getDamageresitance() {
    return this.damageresitance;
  }

  public void setDamageresitance(double damageresitance) {
    this.damageresitance = damageresitance;
  }

  public double getDefance() {
    return this.defance;
  }

  public void setDefance(double defance) {
    this.defance = defance;
  }

  public double getDamagebonus() {
    return this.damagebonus;
  }

  public void setDamagebonus(double damagebonus) {
    this.damagebonus = damagebonus;
  }

  public int getSpelldamage() {
    return this.spelldamage;
  }

  public void setSpelldamage(int spelldamage) {
    this.spelldamage = spelldamage;
  }

  public int getPotionbonus() {
    return this.potionbonus;
  }

  public void setPotionbonus(int potionbonus) {
    this.potionbonus = potionbonus;
  }

  public int getPrecision() {
    return this.precision;
  }

  public void setPrecision(int precision) {
    this.precision = precision;
  }

  public int getPrecisionsto() {
    return this.precisionsto;
  }

  public void setPrecisionsto(int precisionsto) {
    this.precisionsto = precisionsto;
  }

  public int getPrecisionbonus() {
    return this.precisionbonus;
  }

  public void setPrecisionbonus(int precisionbonus) {
    this.precisionbonus = precisionbonus;
  }

  public double getDamage() {
    return this.damage;
  }

  public void setDamage(double damage) {
    this.damage = damage;
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
      System.out.println(
        "Added " + potion.name() + " to " + wizzardname + "'s potions!"
      );
    } else if (potions.size() >= MAX_POTIONS) {
      System.out.println(wizzardname + "'s potion bag is already full!");
    } else {
      System.out.println(
        wizzardname + " already has " + potion.name() + " in their potion bag!"
      );
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

  public double damagetaken(double damage, double damageresitance) {
    double lifepoint = (damage * 1 - (damageresitance / 100));
    setLifepoint((int) lifepoint);
    return lifepoint;
  }
}
