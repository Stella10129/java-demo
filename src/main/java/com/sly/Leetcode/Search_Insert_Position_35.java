package com.sly.Leetcode;

public class Search_Insert_Position_35 {

    public int bio_search_insert(int[] nums, int target){
        if (nums.length == 1 && nums[0] < target) return 1;
        if (nums.length == 1 && nums[0] >= target) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return right + 1;
    }

    public static void main(String[] args) {
        Search_Insert_Position_35 I = new Search_Insert_Position_35();
        int[] nums = {1,3,5,6};
        int target = 2;
        int res = I.bio_search_insert(nums, target);
        System.out.println(res);
    }
}
