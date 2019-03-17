public class Penguin extends Bird{
    public Penguin(String name){
        super(name);
    }
    public void fly(){
        System.out.println(getName()+ " can't fly but swim!");
    }
}
