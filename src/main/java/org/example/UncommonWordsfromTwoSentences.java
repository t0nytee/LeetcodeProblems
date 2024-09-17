package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsfromTwoSentences {

    public static String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for(String s : s1.split(" ")) {
            map1.put(s, map1.getOrDefault(s,0)+1);
        }
        for(String s : s2.split(" ")) {
            map2.put(s, map2.getOrDefault(s,0)+1);
        }

        List<String> res = new ArrayList<>();
        for(String s : map1.keySet()) {
            if(map1.get(s)==1 && map2.containsKey(s)==false) {
                res.add(s);
            }
        }
        for(String s : map2.keySet()) {
            if(map2.get(s)==1 && map1.containsKey(s)==false) {
                res.add(s);
            }
        }
        String[] ans = new String[res.size()];
        for(int i=0;i<res.size();i++) {
            ans[i] = res.get(i);
        }
        return ans;

    }
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        uncommonFromSentences(s1, s2);

    }
}
