package CBTpractice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        int sum=0;
        for(int i=n; i!=0; i/=10){
            int digit = i%10;
            sum += digit*digit*digit;
        }
        if(sum == n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }
    }
}
