package com.dsa;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

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

        System.out.println("Before Sorting");
        for (int num:nums){
            System.out.print(num +" ");
        }

        bubbleSort(nums);

        System.out.println("\n==== ==== ====\nAfter Sorting");
        for (int num:nums){
            System.out.print(num +" ");
        }

    }

    //bubble sort
    public static void bubbleSort(int [] nums){

        int temp;

        for (int i =0;i<nums.length-1;i++){
            for(int j= 0; j<nums.length-1;j++){

                if(nums[j]> nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
