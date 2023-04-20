package main.java.Game.enemys;

import main.java.Game.spell.Spell;
import main.java.Game.wizzard.Wizzard;

public class Troll extends AbsEnemy {

  @Override
  public void attack(Wizzard wizard, Spell spell, EnumEnemy enemy) {
    int damage = spell.getDamage() + enemy.getSpelldamage();
    double precision = enemy.getPrecision();

    if (Math.random() < precision) {
      wizard.receiveDamage(damage);
      System.out.println(
        enemy.getEnemyname() +
        " cast " +
        spell.getName() +
        " on " +
        wizard.getName() +
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
