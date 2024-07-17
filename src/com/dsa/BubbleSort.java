package com.dsa;

import java.util.Scanner;

public class BubbleSort extends BaseArray{

    public static void main(String[] args) {

      int [] nums = takeArray();
      unsortArray(nums);
      bubbleSort(nums);
      sortArray(nums);
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
