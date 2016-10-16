package com.hacker.earth;

import java.util.Scanner;

public class Album {

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String cost[] = s.next().split(" ");
        int Q = s.nextInt();
        for (int i = 0; i < Q; i++) {
            int L = s.nextInt();
            int R = s.nextInt();
            int K = s.nextInt();
            long count = 0;
            for (int j = L-1; j < R; j++) {
                if (Integer.parseInt(cost[j]) % K == 0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
