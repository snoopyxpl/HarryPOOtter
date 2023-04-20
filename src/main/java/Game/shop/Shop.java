package main.java.Game.shop;

import java.util.ArrayList;
import java.util.List;
import main.java.Game.potions.Potion;

public class Shop {

  private List<Potion> potions;

  public Shop(List<Potion> potions) {
    this.potions = new ArrayList<>();
  }

  public List<Potion> getPotions() {
    return this.potions;
  }

  public void setPotions(List<Potion> potions) {
    this.potions = potions;
  }
}
