package com.sly.Leetcode;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {

    static int[] Search(int[] nums, int target){
        int[] res = {-1,-1};
        if(nums.length == 0) return res;
        int len = nums.length - 1;
        if(nums[0] > target || nums[len] < target) return res;
        int left = 0;
        int right = len;
        while (nums[left] < target && left <= right) {
            left++;
        }
        if (nums[left] == target) res[0] = left;
        while (nums[right] > target && left <= right) {
            right--;
        }
        if (nums[right] == target) res[1] = right;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int[] res = Search(nums, target);
        for(int r : res){
            System.out.println(r + " ");
        }
    }

}
