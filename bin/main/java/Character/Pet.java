/*
 * Decompiled with CFR 0.152.
 */
package main.java.Character;

import main.java.Character.TypePet;

public class Pet {
    private TypePet typepet;
    private String petname;

    public Pet(TypePet typepet, String petname) {
        this.typepet = typepet;
        this.petname = petname;
    }

    public TypePet getTypepet() {
        return this.typepet;
    }

    public void setTypepet(TypePet typepet) {
        this.typepet = typepet;
    }

    public String getPetname() {
        return this.petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }
}
