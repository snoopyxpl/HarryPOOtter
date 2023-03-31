package main.java.Character;

public class Boss extends AbsEnemy {

    public Boss(int lifepoint, double damagereseitancebonus, double damageresitance, double defance, double damagebonus,
            int spelldamage, int potionbonus, int precision, int precisionsto, int precisionbonus, double damage,
            String enemyname) {
        super(lifepoint, damagereseitancebonus, damageresitance, defance, damagebonus, spelldamage, potionbonus,
                precision,
                precisionsto, precisionbonus, damage, enemyname);
    }

    @Override
    public void attack(Character target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

}
