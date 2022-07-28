package factory;

public class WeaponFactory {
    public Weapon getWeapon(String weaponType){
    if(weaponType == null){
        return null;
    }
    if(weaponType.equalsIgnoreCase("GUN")){
    return new Gun();
    }
    else if(weaponType.equalsIgnoreCase("SWORD")){
    return new Sword();
    }
    return null;
    }
}
