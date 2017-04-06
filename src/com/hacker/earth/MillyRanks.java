package com.hacker.earth;

import java.text.SimpleDateFormat;
import java.util.*;

public class MillyRanks {
    public static void main(String args[] ) throws Exception {

        //Scanner
        /*Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            int N = s.nextInt();
            int[] ranks = new int[N];
            for (int j = 0; j < N; j++) {
                ranks[j] = s.nextInt();
            }
            Arrays.sort(ranks);
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += j+1-ranks[j];
            }
            System.out.println(sum);
        }*/

        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int circleX = in.nextInt();
        int circleY = in.nextInt();
        int r = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        for(int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int cx = j - circleX;
                int cy = i - circleY;
                if (cx * cx + cy * cy <= r * r)
                    System.out.print(". ");
            }
        }
    }
}
