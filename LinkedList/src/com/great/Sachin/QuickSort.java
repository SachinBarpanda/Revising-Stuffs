package com.great.Sachin;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {3,7,6,1,9,2,5};
        System.out.println("Given array");
        printArray(arr);
        System.out.println();
        findMedian(arr,0,arr.length-1);

    }
    public static void printArray(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void findMedian(int[]arr,int start,int end){
        if(start<end){
            int pIndex = partition(arr,start,end);
            if(arr.length%2==0){
                if(pIndex==(arr.length/2)||pIndex==((arr.length/2)+1)){
                    if(pIndex==(arr.length/2)){
                        System.out.println("Medians are : "+arr[pIndex]+" and "+ arr[(pIndex+1)]);
                    }
                    else {
                        System.out.println("Medians are : "+ arr[(pIndex-1)] +" and "+ arr[pIndex]);
                    }
                }
                else{
                    if(pIndex>(arr.length/2)){
                        findMedian(arr,pIndex+1,end);
                    }
                    else findMedian(arr,start,pIndex-1);
                }
            }
            else {
                if(pIndex==(arr.length/2)){
                    System.out.println("Medians is : "+arr[pIndex]);
                }
                else{
                    if(pIndex>(arr.length/2)){
                        findMedian(arr,pIndex+1,end);
                    }
                    else findMedian(arr,start,pIndex-1);
                }

            }
            findMedian(arr,start,pIndex-1);
            findMedian(arr,pIndex+1,end);
        }

    }
    public static int partition(int[]arr,int start,int end){
        int pIndex = start;
        int pivot = arr[end];
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[pIndex];
                arr[pIndex]=temp;
                pIndex++;
            }
        }
        int temp=arr[pIndex];
        arr[pIndex]= arr[end];
        arr[end]=temp;

        return pIndex;
    }
}
