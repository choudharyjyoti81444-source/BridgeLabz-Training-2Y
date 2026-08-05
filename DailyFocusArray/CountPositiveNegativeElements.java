package com.gla.DSA.DailyFocusArray;

public class CountPositiveNegativeElements {
    public static void main(String[] args) {
        int arr[] ={10,-20,30,-40,50};
        int positivecount = 0;
        int negativecount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                System.out.println("Positive elements are:" +arr[i]);
                positivecount++;
            }
            else {
                System.out.println("Negative elements are:" +arr[i]);
                negativecount++;
            }
        }
        System.out.println("Total Positive Elements = " + positivecount);
        System.out.println("Total Negative Elements = " + negativecount);
    }
}
