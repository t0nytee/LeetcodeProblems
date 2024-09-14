package org.example;

public class LongestSubarrayWithMaximumBitwiseAND {
    public static int longestSubarray(int[] nums) {
        int n = nums.length;
        int mx = 0;
        for(int x : nums) {
            mx = Math.max(mx, x);
        }
        int maxlen = 0, curlen = 0;
        for(int i=0;i<n;i++) {
            if(nums[i]==mx) {
                curlen++;
                maxlen = Math.max(maxlen, curlen);
            }else
                curlen = 0;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,2};
        System.out.println(longestSubarray(nums));
    }
}
