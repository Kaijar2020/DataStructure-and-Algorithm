package com.dsa;

import java.util.Scanner;

public class BaseArray {

    public static int[] takeArray(){
        // Taken array size
        int n;
        System.out.print("Enter Array Size: ");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();

        System.out.print("Enter Array Value: ");
        //Declare Array.
        int[] nums = new int[n];
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<n;i++){
            //Assign value into the array.
            nums[i]= scan.nextInt();
        }
        return nums;
    }

    public static void unsortArray(int [] nums){
        System.out.println("Before Sorting");
        for (int num:nums){
            System.out.print(num +" ");
        }
    }

    public static void sortArray(int [] nums) {
        System.out.println("\n==== ==== ====\nAfter Sorting");
        for (int num:nums){
            System.out.print(num +" ");
        }
    }
}
