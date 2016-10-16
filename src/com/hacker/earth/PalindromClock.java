package com.hacker.earth;

import java.util.Scanner;

public class PalindromClock {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            String start = s.next();
            String end = s.next();
            int count = 0;
            while (!start.equals(end)) {
                if (isPalindrom(start)) {
                    count++;
                }
                int rem = Integer.parseInt(start) % 100;
                if (rem < 59) {
                    String hh = start.substring(0, 2);
                    String mm = start.substring(2, 4);
                    mm = String.format("%02d", Integer.parseInt(mm)+1);
                    start = hh + mm;
                }
                else {
                    String hh = start.substring(0, 2);
                    String mm = start.substring(2, 4);
                    hh = String.format("%02d", Integer.parseInt(hh)+1);
                    start = hh + "00";
                }
            }
            if (isPalindrom(end))
                count++;
            System.out.println(count);
        }
    }

    private static boolean isPalindrom(String start) {
        String rev = new StringBuilder().append(start).reverse().toString();
        return start.equals(rev);
    }

}
