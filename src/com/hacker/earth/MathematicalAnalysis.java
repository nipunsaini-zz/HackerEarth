package com.hacker.earth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MathematicalAnalysis {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        Integer N = s.nextInt();
        final double mod = Math.pow(10, 9) + 7;

        Integer arr[] = new Integer[N];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            int val = s.nextInt();
            arr[i] = val;
            if (!map.containsKey(val)) {
                map.put(val, getDivisor(val));
            }
        }
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int l = s.nextInt();
            int r = s.nextInt();
            long result = map.get(arr[l-1]);
            for (int j = l; j < r; j++) {
                result *= map.get(arr[j]);
                if (result > mod)
                    result %= mod;
            }
            System.out.println(result);
        }
    }

    private static Integer getDivisor(Integer number) {
        long copyOfInput = number;
        int i;
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }

        return (i == number) ? 1 : i;
    }
}
