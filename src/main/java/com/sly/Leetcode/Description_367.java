package com.sly.Leetcode;

public class Description_367 {
    public static int Description(int x){
        if(x == 1) return 1;
        int left = 0;
        int right = x / 2;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if ((long)mid * mid == x) return 1;
            else if ((long)mid * mid > x)
                right = mid - 1;
            else if ((long)mid * mid < x)
                left = mid + 1;
        }
        return 0;
    }
    public static boolean isPerfectSquare(int num) {
        if (Description(num) == 1) return true;
        else return false;
    }

    public static void main(String[] args) {
        int num = 8;
        boolean res = isPerfectSquare(num);
        System.out.println(res);
    }
}
