package com.hacker.earth;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CoolNumbers {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            int l = s.nextInt();
            int r = s.nextInt();
            int cool = 0;
            int sum = 0;
            for (int j = l; j <= r; j++) {
                if (cool < j) {
                    cool = findCool(j);
                }
                sum += cool;
            }
            System.out.println(sum);
        }
    }

    private static int findCool(int j) {
        for (int i = j; i < Integer.MAX_VALUE; i++) {
            if(String.valueOf(i).matches("[25]+")) {
                return i;
            }
        }
        return 0;
    }
}
