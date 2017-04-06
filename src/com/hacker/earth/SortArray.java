package com.hacker.earth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortArray {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return (Math.abs(o1.intValue()) < Math.abs(o2.intValue())) ? -1 : 1;
            }
        });
        for (int val : a) System.out.print(val + " ");
    }
}
