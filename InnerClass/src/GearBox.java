import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gears> gears;
    private int maxGears;
    private int currentGears;
    private boolean cluchIsIn;

    public GearBox(int maxGears){
        this.maxGears=maxGears;
        this.gears=new ArrayList<>();
        Gears neutral = new Gears(0,0.0);
        this.gears.add(neutral);
    }

    public void setCluchIsIn(boolean in){
        this.cluchIsIn=in;
    }

    public void addGears(int gearNumber,double ratio){
        if((gearNumber>0)&&(gearNumber<=maxGears)){
            this.gears.add(new Gears(gearNumber,ratio));
        }
    }

    public void changeGear(int newGears){
        if((newGears>=0)&&(newGears<this.gears.size())&&this.cluchIsIn){
            this.currentGears = newGears;
            System.out.println("Gears "+newGears+ " selected.");
        }
        else {
            System.out.println("Grind!");
            this.currentGears = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(cluchIsIn){
            System.out.println("Scream!");
            return 0.0;
        }
        return (double)revs* gears.get(currentGears).getRatio();
    }
    private class Gears{
        private int gearNumber;
        private double ratio;

        public Gears(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public void setRatio(double ratio) {
            this.ratio = ratio;
        }

        public  double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }
}
