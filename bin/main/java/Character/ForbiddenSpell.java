/*
 * Decompiled with CFR 0.152.
 */
package main.java.Character;

import main.java.Character.AbsSpell;
import main.java.Character.EnumSpell;

public class ForbiddenSpell
extends AbsSpell {
    private final String name;

    public ForbiddenSpell(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static boolean isForbidden(EnumSpell spell) {
        return false;
    }
}
