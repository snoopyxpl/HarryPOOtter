package main.java.Game.enemys;

import main.java.Game.spell.Spell;
import main.java.Game.wizzard.Wizzard;

public class Enemy extends AbsEnemy {

  @Override
  public void attack(Wizzard wizzard, Spell spell, EnumEnemy enemy) {
    double damage = spell.getDamage() + enemy.getSpelldamage();
    double precision = enemy.getPrecision();

    if (Math.random() < precision) {
      wizzard.damagetaken(damage, wizzard.getDamageresitance());
    }
  }
}
