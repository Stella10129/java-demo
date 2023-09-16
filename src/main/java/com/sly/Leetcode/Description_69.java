package com.sly.Leetcode;

public class Description_69 {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int left = 0;
        int right = x / 2;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if ((long)mid * mid == x) return mid;
            else if ((long)mid * mid > x)
                right = mid - 1;
            else if ((long)mid * mid < x)
                left = mid + 1;
        }
        return right;
    }

    public static void main(String[] args) {
        Description_69 D = new Description_69();
        int x = 2147395599;
        int res = D.mySqrt(x);
        System.out.println(res);
    }
}
