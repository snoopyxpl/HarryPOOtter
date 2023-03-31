/*
 * Decompiled with CFR 0.152.
 */
package main.java.Character;

import main.java.Character.Character;

public abstract class AbsEnemy
extends Character {
    private String enemyname;

    public AbsEnemy(int lifepoint, double damagereseitancebonus, double damageresitance, double defance, double damagebonus, int spelldamage, int potionbonus, int precision, int precisionsto, int precisionbonus, double damage, String enemyname) {
        super(lifepoint, damagereseitancebonus, damageresitance, defance, damagebonus, spelldamage, potionbonus, precision, precisionsto, precisionbonus, damage);
        this.enemyname = enemyname;
    }

    public String getEnemyname() {
        return this.enemyname;
    }

    public void setEnemyname(String enemyname) {
        this.enemyname = enemyname;
    }
}
