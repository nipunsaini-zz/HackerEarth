package com.hacker.earth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FamilyParty {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double mod = Math.pow(10, 9) + 7;
        String line = br.readLine();
        int N = Integer.parseInt(line);
        char[] foodTypes = br.readLine().toCharArray();
        char[] sleepTypes = br.readLine().toCharArray();
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            String[] indexes = br.readLine().split(" ");
            int L = Integer.parseInt(indexes[0]) - 1;
            int R = Integer.parseInt(indexes[1]) - 1;
            long count = 0;
            for (int j = L; j < R; j++) {
                for (int k = j+1; k <= R; k++) {
                    if ((foodTypes[j] == foodTypes[k]) || (sleepTypes[j] == sleepTypes[k]))
                        count++;
                    if (count > mod)
                        count %= mod;
                }
            }
            System.out.println(count);
        }
    }
}
