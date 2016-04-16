package com.hacker.earth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AkashAndGCD {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String[] elements = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
        	arr[i] = Integer.parseInt(elements[i]);
        }
        int Q = Integer.parseInt(br.readLine());
        for(int i = 0; i < Q; i++){
        	String[] query = br.readLine().split(" ");
        	int X = Integer.parseInt(query[1]);
        	int Y = Integer.parseInt(query[2]);
        	if(query[0].equals("C")){
        		long sum = 0;
        		for(int j = X-1; j < Y; j++){
        			sum += F(arr[j]);
        			sum %= mod;
        		}
        		System.out.println(sum);
        	}
        	else{
        		arr[X-1] = Y;
        	}
        }

	}
	
	public static final int mod = (int)(Math.pow(10, 9) + 7);
	
	public static long F(int n){
		long gcdSum = 0;
		for(int i=1; i <= n; i++){
			gcdSum += GCD(i,n);
			gcdSum %= mod;
		}
		return gcdSum;
	}
	
	public static int GCD(int x, int y){
		if(y == 0){ 
			return x; 
		} 
		return GCD(y, x%y);
	}

}
