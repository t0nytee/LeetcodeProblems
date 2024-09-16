package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {
    public static int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] minutes = new int[n];
        for(int i=0;i<n;i++){
            String time = timePoints.get(i);
            int h = Integer.parseInt(time.substring(0,2));
            int m = Integer.parseInt(time.substring(3));
            minutes[i] = h*60 + m;

        }
        Arrays.sort(minutes);
        int ans = 1500;
        for(int i=0;i<n-1;i++) {
            ans = Math.min(ans, minutes[i+1]-minutes[i]);
        }
        ans = Math.min(ans, 24*60-minutes[n-1]+minutes[0]);
        return ans;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("00:00");
        list.add("23:59");
        System.out.println(findMinDifference(list));
    }

}
