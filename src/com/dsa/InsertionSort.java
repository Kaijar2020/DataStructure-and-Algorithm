package com.dsa;

public class InsertionSort{

    public static void main(String[] args) {

        BaseArray basearray = new BaseArray();

        int[] nums = basearray.takeArray();
        basearray.unsortArray(nums);
        insertionSort(nums);
        basearray.sortArray(nums);
    }

    public static void insertionSort(int [] nums){

        for (int i=1;i<nums.length;i++){

            int key = nums[i];
            int j = i-1;

            while(j>=0 && nums[j] > key){
                nums[j+1] =nums [j];
                j--;
            }
            nums[j+1]= key;
        }

    }
}
