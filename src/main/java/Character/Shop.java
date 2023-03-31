package main.java.Character;
import java.util.ArrayList;
import java.util.List;
public class Shop {
    private List<Potion> potions;
    public Shop(List<Potion> potions) {
        this.potions = new ArrayList<>();
    }

    public List<Potion> getPotions() {
        return this.potions;
    }

    public void setPotions(List<Potion> potions) {
        this.potions = potions;
    }

}


