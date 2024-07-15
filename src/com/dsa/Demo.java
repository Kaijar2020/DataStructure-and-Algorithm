package com.dsa;

public class Demo {


    public static void main(String[] args) {

        int nums[] = {5,6,7,9,11,13,15};
        int target = 9;

      int result = linearSearch(nums, target);
      int result1 = binarySearch(nums, target);

        if(result != -1 || result1 != -1){
            System.out.println("Element found at index " + result);
        }
        else {
            System.out.println("Element is not in the Array.");
        }

    }

    //Linear Search in Sorted Array.
    public static int linearSearch(int[] nums, int target){

        for (int i = 0;i<nums.length;i++){
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    //Binary Search in Sorted Array.
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if (nums[mid] == target){
                return  mid;
            }
            else if (nums[mid] < target) {
                 start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return -1;
    }
}