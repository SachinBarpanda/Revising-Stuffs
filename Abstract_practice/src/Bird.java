public abstract class Bird extends Animal implements Canfly{
    @Override
    public void eat() {
        System.out.println(getName()+" eats worms");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in breathe out!");
    }

public Bird(String name) {
        super(name);
    }

    public void canFly(){
        System.out.println(getName()+ " is flapping it's wings");
    }
}
