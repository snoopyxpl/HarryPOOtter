package main.java.Game.enemys;

import main.java.Game.spell.Spell;
import main.java.Game.wizzard.Wizzard;

public class Enemy extends AbsEnemy {

  @Override
  public void attack(Wizzard wizzard, Spell spell, EnumEnemy enemy) {
    int damage = spell.getDamage() + enemy.getSpelldamage();
    double precision = enemy.getPrecision();

    if (Math.random() < precision) {
      wizzard.setDamage(damage);
      System.out.println(
        enemy.getEnemyname() +
        " cast " +
        spell.getName() +
        " on " +
        wizzard.getWizzardname() +
        ", causing " +
        damage +
        " damage!"
      );
    } else {
      System.out.println(
        enemy.getEnemyname() + "'s " + spell.getName() + " missed!"
      );
    }
  }
}
