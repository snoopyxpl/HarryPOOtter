/*
 * Decompiled with CFR 0.152.
 */
package main.java.Character;

import main.java.Character.SpellType;

public enum EnumSpell {
    AVADA_KEDAVRA("Avada Kedavra", 100, SpellType.ATTACK, true),
    IMPERIO("Imperio", 50, SpellType.ATTACK, false),
    EXPELLIARMUS("Expelliarmus", 10, SpellType.DEFENSE, false),
    STUPEFY("Stupefy", 15, SpellType.ATTACK, false),
    PROTEGO("Protego", 5, SpellType.DEFENSE, false),
    IMPEDIMENTA("Impedimenta", 20, SpellType.ATTACK, false),
    WINGARDIUM_LEVIOSA("Wingardium leviosa", 0, SpellType.UTIL, false);

    private final String name;
    private final int damage;
    private final SpellType type;
    private final boolean forbidden;

    private EnumSpell(String name, int damage, SpellType type, boolean forbidden) {
        this.name = name;
        this.damage = damage;
        this.type = type;
        this.forbidden = forbidden;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public SpellType getType() {
        return this.type;
    }

    public boolean isForbidden() {
        return this.forbidden;
    }
}
