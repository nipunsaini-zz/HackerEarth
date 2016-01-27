/*
Problem Statement:

Recently you invented a brand-new definition of prime numbers. 
For a given set of positive integers S let's call X a prime if there are no elements in S which are divisors of X (except X itself).
You are given a set S. Find elements in it which are prime numbers for this set.

Input:
The first line contains one integer N - size of the set S. 
The second line contains N space-separated integers - elements of S. 
All the numbers are pairwise different.

Output:
Output one line: elements of S which are prime numbers for this set in the order they occur in the input. 
Separate them by whitespaces.

Constraints:
    N <= 100
    1 <= S[i] <= 106 (1<=i<=n)

Sample Input:
5
10 5 3 15 16

Sample Output:
 5 3 16

*/

package programming.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyPrime {
	
	public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String arr[] = br.readLine().split(" ");
        int S[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(arr[i]);
        }
        
        for(int j = 0; j < N; j++){
        	int number = S[j];
        	int k = 0;
        	for(k = 0; k < N; k++){
        		if(j!=k && number%S[k] == 0){
        			break;
        		}
        	}
        	if(k == N)
        	System.out.print(number + " ");
        }

        
    }

}
