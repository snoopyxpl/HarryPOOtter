package main.java.Game.enemys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import main.java.Game.spell.EnumSpell;

public enum EnumEnemy {
  Troll(100, 0.0, 0, 0, 0.0, "Troll", Arrays.asList(EnumSpell.FIREBALL)),
  LordVoldemort(
    100,
    0.0,
    0,
    0,
    0.0,
    "Lord Voldemort",
    Arrays.asList(EnumSpell.FIREBALL)
  ),
  DeathEater(
    100,
    0.0,
    0,
    0,
    0.0,
    "Death Eater",
    Arrays.asList(EnumSpell.FIREBALL)
  ),
  Dementor(100, 0.0, 0, 0, 0.0, "Dementor", Arrays.asList(EnumSpell.FIREBALL)),
  DoloresUmbridge(
    100,
    0.0,
    0,
    0,
    0.0,
    "Dolores Umbridge",
    Arrays.asList(EnumSpell.FIREBALL)
  ),
  BellatrixLestrange(
    100,
    0.0,
    0,
    0,
    0.0,
    "Bellatrix Lestrange",
    Arrays.asList(EnumSpell.FIREBALL)
  ),
  Basilic(100, 0.0, 0, 0, 0.0, "Basilic", Arrays.asList(EnumSpell.FIREBALL));

  private int lifepoint;
  private double defense;
  private int spelldamage;
  private int precision;
  private double damage;
  private String enemyname;
  private List<EnumSpell> spellList;

  EnumEnemy(
    int lifepoint,
    double defense,
    int spelldamage,
    int precision,
    double damage,
    String enemyname,
    List<EnumSpell> spellList
  ) {
    this.lifepoint = lifepoint;
    this.defense = defense;
    this.spelldamage = spelldamage;
    this.precision = precision;
    this.damage = damage;
    this.enemyname = enemyname;
    this.spellList = new ArrayList<>();
  }

  public int getLifepoint() {
    return this.lifepoint;
  }

  public double getDefense() {
    return this.defense;
  }

  public int getSpelldamage() {
    return this.spelldamage;
  }

  public int getPrecision() {
    return this.precision;
  }

  public double getDamage() {
    return this.damage;
  }

  public String getEnemyname() {
    return this.enemyname;
  }

  public void setLifepoint(int lifepoint) {
    this.lifepoint = lifepoint;
  }

  public void setDefense(double defense) {
    this.defense = defense;
  }

  public void setSpelldamage(int spelldamage) {
    this.spelldamage = spelldamage;
  }

  public void setPrecision(int precision) {
    this.precision = precision;
  }

  public void setDamage(double damage) {
    this.damage = damage;
  }

  public void setEnemyname(String enemyname) {
    this.enemyname = enemyname;
  }

  public List<EnumSpell> getSpellList() {
    return spellList;
  }

  public void setSpellList(List<EnumSpell> spellList) {
    this.spellList = spellList;
  }
}
