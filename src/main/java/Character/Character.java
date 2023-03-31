package main.java.Character;

public abstract class Character {
    private int lifepoint ;
    public double damagereseitancebonus;
    public double damageresitance;
    private double defance;
    public double damagebonus;
    private int spelldamage;
    public int potionbonus;
    private int precision;
    private int precisionsto;
    public int precisionbonus;
    private double damage;
    
    public double  getdamage(double damagebonus, int spelldamage){
         double damage=damagebonus*spelldamage;
         return damage;
    }
    public double  getresitance(double damagereseitancebonus, double damagereseitance){
        double defance=damagereseitance*damagereseitancebonus;
        return defance;
   }
   public double updatedef(double defance){
        double damageresitance=defance;
        return damageresitance;
   }
   public int getprecision(int precision, int precisionbonus){
    int precisionsto=precision+precisionbonus;
    return precisionsto;
   }
   public int updatepres(int precisionsto){
    int precision=precisionsto;
    return precision;
   }

    public int getLifepoint() {
        return this.lifepoint;
    }

    public void setLifepoint(int lifepoint) {
        this.lifepoint = lifepoint;
    }

    public double getDamagereseitancebonus() {
        return this.damagereseitancebonus;
    }

    public void setDamagereseitancebonus(double damagereseitancebonus) {
        this.damagereseitancebonus = damagereseitancebonus;
    }

    public double getDamageresitance() {
        return this.damageresitance;
    }

    public void setDamageresitance(double damageresitance) {
        this.damageresitance = damageresitance;
    }

    public double getDefance() {
        return this.defance;
    }

    public void setDefance(double defance) {
        this.defance = defance;
    }

    public double getDamagebonus() {
        return this.damagebonus;
    }

    public void setDamagebonus(double damagebonus) {
        this.damagebonus = damagebonus;
    }

    public int getSpelldamage() {
        return this.spelldamage;
    }

    public void setSpelldamage(int spelldamage) {
        this.spelldamage = spelldamage;
    }

    public int getPotionbonus() {
        return this.potionbonus;
    }

    public void setPotionbonus(int potionbonus) {
        this.potionbonus = potionbonus;
    }

    public int getPrecision() {
        return this.precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getPrecisionsto() {
        return this.precisionsto;
    }

    public void setPrecisionsto(int precisionsto) {
        this.precisionsto = precisionsto;
    }

    public int getPrecisionbonus() {
        return this.precisionbonus;
    }

    public void setPrecisionbonus(int precisionbonus) {
        this.precisionbonus = precisionbonus;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
    

    public Character(int lifepoint, double damagereseitancebonus, double damageresitance, double defance, double damagebonus, int spelldamage, int potionbonus, int precision, int precisionsto, int precisionbonus, double damage) {
        this.lifepoint = lifepoint;
        this.damagereseitancebonus = damagereseitancebonus;
        this.damageresitance = damageresitance;
        this.defance = defance;
        this.damagebonus = damagebonus;
        this.spelldamage = spelldamage;
        this.potionbonus = potionbonus;
        this.precision = precision;
        this.precisionsto = precisionsto;
        this.precisionbonus = precisionbonus;
        this.damage = damage;
    }

}
