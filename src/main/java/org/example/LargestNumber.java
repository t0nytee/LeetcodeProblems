package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

   static public String largestNumber(int[] nums) {
       List<String> res = new ArrayList<>();
       for(int x : nums) {
           res.add(String.valueOf(x));
       }
       Comparator<String> comparator = new Comparator<String>() {
           @Override
           public int compare(String a, String b) {
               String s1 = a + b;
               String s2 = b + a;
               return s2.compareTo(s1);
           }
       };
       Collections.sort(res, comparator);
       if(res.get(0).charAt(0)=='0')
           return "0";
       StringBuilder sb = new StringBuilder();
       for(String s : res) {
           sb.append(s);
       }
       return sb.toString();
   }
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));

    }
}
