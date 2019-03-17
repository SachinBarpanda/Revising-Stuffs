import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner (System.in);
    static Button btn = new Button("PRinting ");
    public static void main(String[] args) {
//        GearBox gearBox = new GearBox(4);
//        gearBox.addGears(1,9.6);
//        gearBox.addGears(2,4.5);
//        gearBox.addGears(3,8.0);
//
//        gearBox.setCluchIsIn(true);
//        gearBox.changeGear(2);
//        gearBox.setCluchIsIn(false);
//        System.out.println(gearBox.wheelSpeed(2000));

        class ClickListener implements Button.onClickListener{
            public ClickListener(){
                System.out.println("In local class attached");
            }
            public void onClick(String title){
                System.out.println(title + " was Clicked !");
            }
        }
        btn.setOnClickListener(new Button.onClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked!");
            }
        });
                listen();
    }
    private static void listen(){
        btn.onClick();
    }
}
