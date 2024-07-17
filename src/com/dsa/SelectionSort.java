package com.dsa;

public class SelectionSort {

    public static void main(String[] args) {

        BaseArray basearray = new BaseArray();

        int[] nums = basearray.takeArray();
        basearray.unsortArray(nums);
        selectionSort(nums);
        basearray.sortArray(nums);

    }

    public static void selectionSort(int[] nums) {
        int minIndex = -1;
        int temp = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}

