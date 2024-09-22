package org.example;

public class KthSmallestinLexicographicalOrder {

   static int countDiff(int n, long left, long right) {
        int steps = 0;
        while(left<=n) {
            steps += ( Math.min(n+1, right) - left);
            left*=10;
            right*=10;
        }
        return steps;
    }
   static public int findKthNumber(int n, int k) {
        int cur = 1;
        k--;
        while(k>0) {
            int steps = countDiff(n, cur, cur+1);
            if(steps<=k) { // kth element is not in this subtree
                k = k - steps;
                cur++; // go to next sibling node
            } else { // kth element in this subtree
                cur = cur * 10; // go first to child node
                k--;
            }

        }
        return cur;
    }
    public static void main(String[] arg) {
        System.out.println(findKthNumber(1000, 56));
    }
}
