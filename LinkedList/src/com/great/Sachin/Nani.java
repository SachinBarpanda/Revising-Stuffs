package com.great.Sachin;

public class Nani {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=i+1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=5-i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
