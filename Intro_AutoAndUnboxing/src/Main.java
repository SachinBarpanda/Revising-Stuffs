import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myInt = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            myInt.add(Integer.valueOf(i));//This is auto boxing
            //Taking an Integer and converting it to wrapper
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "-->" + myInt.get(i).intValue());//Unboxing this is
        }
        Integer myInteger = Integer.valueOf(56);
        int myint = myInteger.intValue();

        ArrayList<Double> myDouble = new ArrayList<>();
        for(double x = 0;x<=10.0;x+=0.5) {
            myDouble.add(Double.valueOf(x));
        }

        for (int x = 0;x<myDouble.size();x++){
            double value = myDouble.get(x).doubleValue();
            System.out.println("Value of " + x +" Element is : "+value);
        }
        //This works too!
        System.out.println("Can also be of normal type ");
        
        for(double x = 0;x<=10.0;x+=0.5) {
            myDouble.add(x);
        }

        for (int x = 0;x<myDouble.size();x++){
            double value = myDouble.get(x);
            System.out.println("Value of " + x +" Element is : "+value);
        }
    }

}
