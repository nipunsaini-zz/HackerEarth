package com.hacker.earth;


import java.util.Scanner;

public class DistinctPowers {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int a = s.nextInt();
            String binary = Integer.toBinaryString(a);
            if (binary.length() == Integer.bitCount(a)) {
                System.out.println(Integer.parseInt(1+binary, 2));
            } else {
                int index = binary.lastIndexOf("0");
                StringBuilder builder = new StringBuilder(binary);
                builder.setCharAt(index, '1');
                System.out.println(Integer.parseInt(builder.toString(), 2));
            }
        }
    }
}
