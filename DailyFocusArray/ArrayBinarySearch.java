package CBTpractice;

import java.util.Arrays;
import java.util.*;

public class ArrayBinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int target = sc.nextInt();
        int low=0, high=n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }
            else if (arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(-1);
    }
}




/*package CBTpractice;

import java.util.Scanner;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
*/