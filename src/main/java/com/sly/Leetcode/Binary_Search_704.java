package com.sly.Leetcode;

public class Binary_Search_704 {
    public int bio_search(int[] nums, int target){
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else if(nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Binary_Search_704 B = new Binary_Search_704();
        int[] nums = {2,5};
        int target = 2;
        int res = B.bio_search(nums, target);
        System.out.println(res);
    }
}
