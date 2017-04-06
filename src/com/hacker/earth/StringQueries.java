package com.hacker.earth;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by naveen on 08-Jan-17.
 */
public class StringQueries {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Q = s.nextInt();
        String str = s.next();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < Q; i++) {
            int l = s.nextInt();
            int r = s.nextInt();
            String sub = str.substring(l-1, r);
            int count  = 0;
            for (Character c : sub.toCharArray()) {
                if (!map.containsKey(c))
                    map.put(c, 1);
                else {
                    int val = map.get(c);
                    map.replace(c, val+1);
                }
            }
            Collection<Integer> col = map.values();
            Integer[] arr = new Integer[col.size()];
            Arrays.sort(col.toArray(arr));
            int min = arr[0];
            for (Integer e : arr) {
                count += e-min;
            }
            System.out.println(count);
            map.clear();
        }
    }
}
