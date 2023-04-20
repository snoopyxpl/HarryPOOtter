package main.java.Game.spell;

import java.util.ArrayList;
import java.util.List;

public class Spell extends AbsSpell {

  private final EnumSpell spellType;

  public Spell(EnumSpell spellType) {
    this.spellType = spellType;
  }

  public String getName() {
    return spellType.getName();
  }

  public int getDamage() {
    return spellType.getDamage();
  }

  public SpellType getType() {
    return spellType.getType();
  }

  public static List<Spell> getAllSpells() {
    List<Spell> spells = new ArrayList<>();
    for (EnumSpell enumSpell : EnumSpell.values()) {
      spells.add(new Spell(enumSpell));
    }
    return spells;
  }

  public EnumSpell getSpell() {
    return spellType;
  }
}
