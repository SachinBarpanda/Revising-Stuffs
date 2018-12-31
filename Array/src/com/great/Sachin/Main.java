package com.great.Sachin;

import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner (System.in);
    static Scanner scCount= new Scanner (System.in);

    public static int[] readInteger(int count){
        int [] y =new int [count];

        System.out.println("Enter the values");
        for(int i = 0;i < count; i++){
            y[i] = sc.nextInt();
        }
        return y;
    }

    public static int findMin(int[] array,int n){
        int min = array[0];
        for(int i = 0 ;i<n;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number of values");
        int count = scCount.nextInt();
        int []x=readInteger(count);
        System.out.println("So the minimum element is : "+findMin(x,x.length));

        }
}
