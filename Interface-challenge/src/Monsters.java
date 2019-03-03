import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISavable {
    String name;
    int hitpoints;
    int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Monsters(String name, int hitpoints, int damage) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", damage=" + damage +
                '}';
    }

    @Override
    public List<String> write(){
        ArrayList<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.damage);
        values.add(2,""+this.hitpoints);
        return values;
    }

    public void read(List<String>savedValue){
        if(savedValue!=null && savedValue.size()> 0 ){
            this.name = savedValue.get(0);
            this.damage= Integer.parseInt(savedValue.get(1));
            this.hitpoints=Integer.parseInt(savedValue.get(2));
        }
    }
}
