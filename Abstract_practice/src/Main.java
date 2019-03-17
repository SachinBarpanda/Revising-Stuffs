public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wafer");
        dog.breathe();
        dog.eat();

        Pigeon bird = new Pigeon("Pigeon");
        bird.breathe();
        bird.eat();
        bird.canFly();
        Penguin penguin = new Penguin("Emperor penguin");
        penguin.fly();
        penguin.canFly();
    }
}
