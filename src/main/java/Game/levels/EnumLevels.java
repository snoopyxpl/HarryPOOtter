package main.java.Game.levels;

import main.java.Game.enemys.EnumEnemy;

public enum EnumLevels {
  ToilettesDuDonjon(
    "Toilettes du donjon",
    1,
    ToilettesDuDonjon.class,
    EnumEnemy.Troll,
    1,
    EnumEnemy.Troll,
    0
  ),
  ChambreDesSecrets(
    "Chambre des secrets",
    2,
    ChambreDesSecrets.class,
    EnumEnemy.Basilic,
    1,
    EnumEnemy.Basilic,
    0
  ),
  LacDanslaForetInterdite(
    "Lac dans la foret interdite",
    3,
    LacDanslaForetInterdite.class,
    EnumEnemy.Dementor,
    2,
    EnumEnemy.Dementor,
    3
  ),
  CimetièreDeLittleHangleton(
    "Cimetière de Little Hangleton",
    4,
    CimetièreDeLittleHangleton.class,
    EnumEnemy.PeterPetigrow,
    1,
    EnumEnemy.LordVoldemort,
    1
  ),
  SalleDexamenDePoudlard(
    "Salle d'examen de Poudlard",
    5,
    SalleDexamenDePoudlard.class,
    EnumEnemy.DoloresUmbridge,
    1,
    EnumEnemy.DoloresUmbridge,
    0
  ),
  TourDastronomie(
    "Tour d'astronomie",
    6,
    TourDastronomie.class,
    EnumEnemy.DeathEater,
    3,
    EnumEnemy.DeathEater,
    2
  ),
  Poudlard(
    "Poudlard",
    7,
    Poudlard.class,
    EnumEnemy.LordVoldemort,
    1,
    EnumEnemy.BellatrixLestrange,
    1
  );

  private String name;
  private int level;
  private Class<?> levelClass;
  private EnumEnemy enemy1;
  private int enemyCount1;
  private EnumEnemy enemy2;
  private int enemyCount2;

  private EnumLevels(
    String name,
    int level,
    Class<?> levelClass,
    EnumEnemy enemy1,
    int enemyCount1,
    EnumEnemy enemy2,
    int enemyCount2
  ) {
    this.name = name;
    this.level = level;
    this.levelClass = levelClass;
    this.enemy1 = enemy1;
    this.enemyCount1 = enemyCount1;
    this.enemy2 = enemy2;
    this.enemyCount2 = enemyCount2;
  }

  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  public Class<?> getLevelClass() {
    return levelClass;
  }

  public EnumEnemy getEnemy1() {
    return enemy1;
  }

  public int getEnemyCount1() {
    return enemyCount1;
  }

  public void setEnemy1(EnumEnemy enemy1) {
    this.enemy1 = enemy1;
  }

  public void setEnemyCount1(int enemyCount1) {
    this.enemyCount1 = enemyCount1;
  }

  public void setLevelClass(Class<?> levelClass) {
    this.levelClass = levelClass;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnumEnemy getEnemy2() {
    return enemy2;
  }

  public void setEnemy2(EnumEnemy enemy2) {
    this.enemy2 = enemy2;
  }

  public int getEnemyCount2() {
    return enemyCount2;
  }

  public void setEnemyCount2(int enemyCount2) {
    this.enemyCount2 = enemyCount2;
  }
}
