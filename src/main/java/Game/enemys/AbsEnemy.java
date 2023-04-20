package main.java.Game.enemys;

import main.java.Game.spell.Spell;
import main.java.Game.wizzard.Wizzard;

public abstract class AbsEnemy {

  public abstract void attack(Wizzard wizzard, Spell spell, EnumEnemy enemy);
}
