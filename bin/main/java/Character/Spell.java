/*
 * Decompiled with CFR 0.152.
 */
package main.java.Character;

import java.util.ArrayList;
import java.util.List;
import main.java.Character.AbsSpell;
import main.java.Character.EnumSpell;
import main.java.Character.SpellType;

public class Spell
extends AbsSpell {
    private final EnumSpell spellType;

    public Spell(EnumSpell spellType) {
        this.spellType = spellType;
    }

    public String getName() {
        return this.spellType.getName();
    }

    public int getDamage() {
        return this.spellType.getDamage();
    }

    public SpellType getType() {
        return this.spellType.getType();
    }

    public static List<Spell> getAllSpells() {
        ArrayList<Spell> spells = new ArrayList<Spell>();
        EnumSpell[] enumSpellArray = EnumSpell.values();
        int n = enumSpellArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumSpell enumSpell = enumSpellArray[n2];
            spells.add(new Spell(enumSpell));
            ++n2;
        }
        return spells;
    }

    public EnumSpell getSpell() {
        return null;
    }
}
