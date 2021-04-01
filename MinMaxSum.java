
package minmaxsum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum2(int[] arr) {
        long max=arr[1],sum=0;
        long min=arr[1];
        for(int i=0;i<arr.length;i++){
            
            if(max<arr[i]){
             max=arr[i];
             
            }
            if(min> arr[i]){
                min=arr[i];
            }
            sum+=arr[i];
        }
       
        System.out.print((sum-max)+" "+(sum-min));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum2(arr);

        scanner.close();
    }
}