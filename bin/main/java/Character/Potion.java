/*
 * Decompiled with CFR 0.152.
 */
package main.java.Character;

import main.java.Character.PotionType;

public class Potion {
    private String potionname;
    private PotionType potiontype;
    private int value;
    private int price;

    public Potion(String potionname, PotionType potiontype, int value, int price) {
        this.potionname = potionname;
        this.potiontype = potiontype;
        this.value = value;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPotionname() {
        return this.potionname;
    }

    public PotionType getPotiontype() {
        return this.potiontype;
    }

    public int getValue() {
        return this.value;
    }

    public void setPotionname(String potionname) {
        this.potionname = potionname;
    }

    public void setPotiontype(PotionType potiontype) {
        this.potiontype = potiontype;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
