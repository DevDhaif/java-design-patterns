package factory;

public class FactoryTesting {
    public static void main(String[] args){
    WeaponFactory weaponFactory = new WeaponFactory();
    
    Weapon weapon1 = weaponFactory.getWeapon("GUN");
    
    weapon1.create();
    
    Weapon weapon2 = weaponFactory.getWeapon("SWORD");
    
    weapon2.create();
    }
}
