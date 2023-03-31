package main.java.Character;
public class Potion {
    private String potionname;
    private PotionType potiontype;
    private int value;
    private int price;
    public Potion(String potionname,PotionType potiontype, int value, int price){
        this.potionname=potionname;
        this.potiontype=potiontype;
        this.value=value;
        this.price=price;

    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getPotionname(){
        return potionname;
    }
    public PotionType getPotiontype(){
        return potiontype;
    }
    public int getValue(){
        return value;
    }
    public void setPotionname(String potionname){
        this.potionname=potionname;
    }
    public void setPotiontype(PotionType potiontype){
        this.potiontype=potiontype;
    }
    public void setValue(int value){
        this.value=value;
    }


}
