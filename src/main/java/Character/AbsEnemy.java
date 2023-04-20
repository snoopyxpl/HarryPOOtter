package main.java.Character;

public abstract class AbsEnemy extends Character {

  private String enemyname;

  public AbsEnemy(
    int lifepoint,
    double damagereseitancebonus,
    double damageresitance,
    double defance,
    double damagebonus,
    int spelldamage,
    int potionbonus,
    int precision,
    int precisionsto,
    int precisionbonus,
    double damage,
    String enemyname
  ) {
    super(
      lifepoint,
      damagereseitancebonus,
      damageresitance,
      defance,
      damagebonus,
      spelldamage,
      potionbonus,
      precision,
      precisionsto,
      precisionbonus,
      damage
    );
    this.enemyname = enemyname;
  }

  public String getEnemyname() {
    return this.enemyname;
  }

  public void setEnemyname(String enemyname) {
    this.enemyname = enemyname;
  }

  public abstract void attack(Character target);
}
