package com.hacker.earth;

import java.util.*;


public class Game
{
    public static void main(String args[])
    {
        test();
        /*Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] a = new int[N];
        int[] b = new int[M];
        for (int i = 0; i < N; i++) a[i] = s.nextInt();
        for (int j = 0; j < M; j++) b[j] = s.nextInt();
        int sumA = 0, sumB = 0;
        for (int i = 0; i < N; i++) {
            int minCounter=0, maxCounter=0;
            for (int j = 0; j < M; j++) {
                if (b[j] < a[i]) minCounter++;
                else if (b[j] > a[i]) maxCounter++;
            }
            sumA += (minCounter * maxCounter);
        }

        for (int i = 0; i < M; i++) {
            int minCounter=0, maxCounter=0;
            for (int j = 0; j < N; j++) {
                if (a[j] < b[i]) minCounter++;
                else if (a[j] > b[i]) maxCounter++;
            }
            sumB += (minCounter * maxCounter);
        }

        if (sumA > sumB) System.out.println("Monk " + (sumA - sumB));
        else if (sumB > sumA) System.out.println("!Monk " + (sumB - sumA));
        else System.out.println("Tie");*/
    }

    public static void test() {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] a = new int[N];
        int[] b = new int[M];
        for (int i = 0; i < N; i++) a[i] = s.nextInt();
        for (int j = 0; j < M; j++) b[j] = s.nextInt();
        int sumA = 0, sumB = 0;
        int max = (N >= M) ? N : M;
        int[] minA = new int[N];
        int[] maxA = new int[N];
        int[] minB = new int[M];
        int[] maxB = new int[M];

        if (N >= M) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (a[i] < b[j]) {
                        maxA[i]++;
                        minB[j]++;
                    } else if (a[i] > b[j]) {
                        minA[i]++;
                        maxB[j]++;
                    }
                }
                sumA += (minA[i] * maxA[i]);
            }
            for (int j = 0; j < M; j++) {
                sumB += (minB[j] * maxB[j]);
            }
        } else {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (b[i] < a[j]) {
                        maxB[i]++;
                        minA[j]++;
                    } else if (b[i] > a[j]) {
                        minB[i]++;
                        maxA[j]++;
                    }
                }
                sumB += (minB[i] * maxB[i]);
            }
            for (int j = 0; j < N; j++) {
                sumA += (minA[j] * maxA[j]);
            }
        }


        /*for (int i = 0; i < max; i++) {
            int minCounterA=0, maxCounterA=0, minCounterB=0, maxCounterB=0;
            if (i < N) {
                for (int j = 0; j < M; j++) {
                    if (b[j] < a[i]) minCounterA++;
                    else if (b[j] > a[i]) maxCounterA++;
                }
                sumA += (minCounterA * maxCounterA);
            }
            if (i < M) {
                for (int j = 0; j < N; j++) {
                    if (a[j] < b[i]) minCounterB++;
                    else if (a[j] > b[i]) maxCounterB++;
                }
                sumB += (minCounterB * maxCounterB);
            }
        }*/


        /*for (int i = 0; i < N; i++) {
            int minCounter=0, maxCounter=0;
            for (int j = 0; j < M; j++) {
                if (b[j] < a[i]) minCounter++;
                else if (b[j] > a[i]) maxCounter++;
            }
            sumA += (minCounter * maxCounter);
        }

        for (int i = 0; i < M; i++) {
            int minCounter=0, maxCounter=0;
            for (int j = 0; j < N; j++) {
                if (a[j] < b[i]) minCounter++;
                else if (a[j] > b[i]) maxCounter++;
            }
            sumB += (minCounter * maxCounter);
        }*/

        if (sumA > sumB) System.out.println("Monk " + (sumA - sumB));
        else if (sumB > sumA) System.out.println("!Monk " + (sumB - sumA));
        else System.out.println("Tie");
    }
}
