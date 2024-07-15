package com.dsa;


import java.util.Scanner;

public class SelectionSort {

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

        selectionSort(nums);

        System.out.println("\n==== ==== ====\nAfter Sorting");
        for (int num:nums){
            System.out.print(num +" ");
        }

    }

    public static void selectionSort(int [] nums){
        int minIndex= -1;
        int temp =0;

        for (int i= 0; i<nums.length-1;i++){
            minIndex=i;
            for (int j=i+1; j<nums.length; j++){
                if (nums[minIndex]> nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }

    }
}
