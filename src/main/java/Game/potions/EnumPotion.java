package main.java.Game.potions;

import main.java.Game.Character;

public enum EnumPotion {
  HEALING_POTION("Healing Potion", PotionType.Healing, 10, 10),
  ATTACK_POTION("Attack Potion", PotionType.Attack, 10, 10),
  DEFENSE_POTION("Defense Potion", PotionType.Defense, 10, 10);

  private String name;
  private PotionType type;
  private int value;
  private int price;

  EnumPotion(String name, PotionType type, int value, int price) {
    this.name = name;
    this.type = type;
    this.value = value;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public PotionType getPotionType() {
    return type;
  }

  public int getValue() {
    return value;
  }

  public int getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPotionType(PotionType type) {
    this.type = type;
  }

  public void setValue(int value, Character character) {
    this.value = value + character.getPotionbonus();
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
