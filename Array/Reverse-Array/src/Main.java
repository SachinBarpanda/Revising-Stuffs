import java.util.Arrays;

public class Main {
public static void reverse(int[] array){
    int n=array.length;
    int halfLength=n/2;
    for(int i = 0;i<halfLength;i++){
        swap(array,array[i],array[n-i-1]);

    }
}
//    int temp = array[i];
//    array[i]=array[n-i-1];
//    array[n-i-1]=temp;

public static void swap(int array[],int array1,int array2){

    int temp = array[array1-1];
        array[array1-1]=array[array2-1];
        array[array2-1]=temp;



}
    public static void main(String[] args) {

    int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));

//        int a = 8,b=7;
//        System.out.println("a"+a+"b"+b);
//        swap(a,b);
//        System.out.println("a"+a+"b"+b);
    }
}
