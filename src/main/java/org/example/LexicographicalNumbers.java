package org.example;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LexicographicalNumbers {

   static public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            res.add(i);
        }
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String s1 = String.valueOf(a);
                String s2 = String.valueOf(b);
                return s1.compareTo(s2);
            }
        };

       Collections.sort(res, comp);
        return  res;
    }
    public static void main(String[] args) {
        int n = 13;
        List<Integer> res = lexicalOrder(n);
        for(int x : res) {
            System.out.print( x + " ");
        }
    }
}
