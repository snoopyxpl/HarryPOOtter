package main.java.Character;

public class ForbiddenSpell extends AbsSpell {

  private final String name;

  public ForbiddenSpell(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static boolean isForbidden(EnumSpell spell) {
    return false;
  }
}
