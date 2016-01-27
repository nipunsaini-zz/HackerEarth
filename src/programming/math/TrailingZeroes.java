/*
Problem Statement:

Given a number find the number of trailing zeroes in its factorial.

Input Format:
A single integer - N

Output Format:
Print a single integer which is the number of trailing zeroes.

Input Constraints:
1 <= N <= 1000

Sample Input:
10

Sample Output:
2

*/

package programming.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrailingZeroes {
	
	public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int divider = 5;
        int count = 0;
        while(divider < N){
        	count += N / divider;
        	divider *= 5;
        }
        
       
        System.out.println(count);
    }

}
