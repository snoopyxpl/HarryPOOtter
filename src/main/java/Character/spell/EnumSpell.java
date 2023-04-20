package main.java.Character.spell;

public enum EnumSpell {
  AVADA_KEDAVRA("Avada Kedavra", 100, SpellType.ATTACK, true),
  IMPERIO("Imperio", 50, SpellType.ATTACK, false),
  EXPELLIARMUS("Expelliarmus", 10, SpellType.DEFENSE, false),
  STUPEFY("Stupefy", 15, SpellType.ATTACK, false),
  PROTEGO("Protego", 5, SpellType.DEFENSE, false),
  IMPEDIMENTA("Impedimenta", 20, SpellType.ATTACK, false),
  WINGARDIUM_LEVIOSA("Wingardium leviosa", 0, SpellType.UTIL, false);

  private final String name;
  private final int spelldamage;
  private final SpellType type;
  private final boolean forbidden;

  EnumSpell(String name, int spelldamage, SpellType type, boolean forbidden) {
    this.name = name;
    this.spelldamage = spelldamage;
    this.type = type;
    this.forbidden = forbidden;
  }

  public String getName() {
    return name;
  }

  public int getDamage() {
    return spelldamage;
  }

  public SpellType getType() {
    return type;
  }

  public boolean isForbidden() {
    return forbidden;
  }
}
