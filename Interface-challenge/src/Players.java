import java.util.ArrayList;
import java.util.List;

public class Players implements ISavable {
    String name;int health;String weaponName;
    int damage;

    public Players(String name,int health,int damage){
        this.name = name;
        this.health=health;
        this.damage=damage;
    }

    public void health() {
        System.out.println("health now is : "+ health);

    }

    public void hitpoint() {
        System.out.println("damage given by the player : "+damage);
    }

    public String weapon() {
        return weaponName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String toString(){
        return "Player stats : \n" +
                "\nname : " + name+
                "\nhealth : " +health+
                "\ndamage : " +damage;
    }


    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.health);
        values.add(2,""+this.damage);
        return values;
    }

    @Override
    public void read(List<String> savedValue) {

        if(savedValue!=null && savedValue.size() > 0){
            this.name=savedValue.get(0);
            this.health=Integer.parseInt(savedValue.get(1));
            this.damage=Integer.parseInt(savedValue.get(2));
        }
    }
}
