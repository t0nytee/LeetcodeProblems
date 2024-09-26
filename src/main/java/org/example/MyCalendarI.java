package org.example;

import java.util.TreeSet;

public class MyCalendarI {

    static class Pair implements Comparable<Pair> {
        int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Pair o) {
            if(this.x==o.x)
                return this.y - o.y;
           return this.x - o.x;
        }
    }

   static TreeSet<Pair> set = new TreeSet<>();
    static public boolean book(int start, int end) {
        Pair target = new Pair(start, end);
         Pair left = set.floor(target);
         Pair right = set.ceiling(target);
         if(left!=null && target.x<left.y)
             return false;
         if(right!=null && target.y>right.x)
             return false;
         set.add(target);
         return true;
    }
    public static void main(String[] args) {

    }
}
