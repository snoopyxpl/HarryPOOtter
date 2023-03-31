package main.java.Character;

import java.util.List;
import java.util.ArrayList;
public enum EnumEnemy {
    TROLL(100, 0.1, 0.1, 0.1, 0.1, 0, 0, 0, 0, "Troll", null),
    ;

    private int lifepoint;
    private double damagereseitancebonus;
    private double damageresitance;
    private double defance;
    private double damagebonus;
    private int spelldamage;
    private int potionbonus;
    private int precision;
    private String enemyname;
    private List<Spell> usablespell;

    EnumEnemy(int lifepoint, double damagereseitancebonus, double damageresitance, double defance,
            double damagebonus, int spelldamage, int precision, int precisionbonus,
            double damage, String enemyname, List<Spell> usablespell) {
        this.lifepoint = lifepoint;
        this.damagereseitancebonus = damagereseitancebonus;
        this.damageresitance = damageresitance;
        this.defance = defance;
        this.damagebonus = damagebonus;
        this.spelldamage = spelldamage;
        this.usablespell = new ArrayList<>();
        this.precision = precision;

    }
}
