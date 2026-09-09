package com.gla.DSA.Class;

public class HetrogeneousArray {
    public static void main(String[] args){
        Object[] arr = {10, "Jyoti", 17.00056, 'A', true};

        for (Object x : arr) {
            System.out.println(x);
        }
    }
}
