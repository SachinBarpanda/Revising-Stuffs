import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Players Sachin = new Players("Sam",100,50);
        Sachin.toString();
        saveObjects(Sachin);
        System.out.println(Sachin);
        loadObjects(Sachin);
        saveObjects(Sachin);
        System.out.println(Sachin);

        ISavable werewolves = new Monsters("fox",2000,100);
        System.out.println(werewolves);
        saveObjects(werewolves);
    }

    public static ArrayList<String> readValues(){
            ArrayList<String> values = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean quit=false;
        int index = 0 ;
        System.out.println("Choose + \n" +
                "1 : Ennter a  String\n" +
                "0 to quit");
        while(!quit){
            System.out.println("Choose an option ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 0 : quit = true;
                break;

                case 1 :
                    System.out.println("Enter a String :");
                    String input = sc.nextLine();
                    values.add(index,input);
                    index++;
                    break;
            }
        }
        return values;

    }

    public static void saveObjects(ISavable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+" to storage");
        }
    }

    public static void loadObjects(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
