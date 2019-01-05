import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x[] =new int [3];
        int largest;
        for(int i=0;i<3;i++) {
            System.out.println("Enter a number of your choice :  \n");
            x[i] = sc.nextInt();
        }
        largest=x[0];
        for(int i = 1; i<x.length;i++){
            if(largest<x[i]){
              largest=x[i];
            }
        }
        System.out.println("Thus the largest number is : "+ largest);
    }
}
