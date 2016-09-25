package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        String[] names = new String[N];
        int[] prices = new int[N];
        int[] quantities = new int[N];

        for (int i = 0; i < N; i++) {
            String namePrices[] = br.readLine().split(" ");
            names[i] = namePrices[0].trim();
            prices[i] = Integer.parseInt(namePrices[1].trim());
        }

        int Q = Integer.parseInt(br.readLine());

        for (int i = 0; i < Q; i++) {
            String queries[] = br.readLine().split(" ");
            if (!queries[0].equals("?")) {
                int index = Arrays.asList(names).indexOf(queries[1]);
                if (queries[0].equals("+")) quantities[index]++;
                else quantities[index]--;
            } else {
                int val = Integer.parseInt(queries[1]);
                int sum = 0;
                for (int j = 0; j < prices.length; j++) {
                    if (prices[j] > val) {
                        sum += quantities[j];
                    }
                }
                System.out.println(sum);
            }

        }
    }
}

