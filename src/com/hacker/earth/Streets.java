package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Streets {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        int[] A = new int[N];
        boolean[] prime = new boolean[N];
        line = br.readLine();
        String[] elem = line.split(" ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(elem[i]);
            prime[i] = isPrime(A[i]);
        }

        for (int i = 0; i < N; i++) {
            if (prime[i]) {
                System.out.print(A[i] + " ");
                continue;
            }
            int backIndex = i-1;
            int forwardIndex = i+1;
            while (backIndex > -1) {
                if (!prime[backIndex])
                    backIndex--;
                else
                    break;
            }
            while (forwardIndex < N) {
                if (!prime[forwardIndex])
                    forwardIndex++;
                else
                    break;
            }
            int index;
            if (backIndex > -1 && forwardIndex < N) {
                index = (i-backIndex) <= (forwardIndex-i) ? backIndex : forwardIndex;
            }else if (backIndex == -1 && forwardIndex < N) {
                index = forwardIndex;
            } else if (backIndex > -1 && forwardIndex == N) {
                index = backIndex;
            } else {
                index = -1;
            }
            if (index != -1)
                System.out.print(A[index] + " ");
            else
                System.out.print(-1 + " ");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
