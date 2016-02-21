package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphaPrime {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int Q = Integer.parseInt(line.trim());
        for(int i = 0; i < Q; i++){
        	line = br.readLine();
        	String[] arr = line.trim().split(" ");
        	int L = Integer.parseInt(arr[0]);
        	int R = Integer.parseInt(arr[1]);
        	int count = 0;
        	for(int j=L; j<= R; j++){
        		
        		int number = j;
        		int divider = 10;
        		while(number!=0){
        			int rem = number % divider;
        			//number /= divider;
        			if(isPrime(rem)){
        				count++;
        				break;
        			}        				
        			if(number / divider == 0)
        				break;
        			divider *= 10;
        			
        		}
        		
        	}
        	System.out.println(count);
        }

	}
	public static boolean isPrime(int n){
		if(n==1 || n==0)
			return false;
		else{
			for(int i=2; i<= n/2; i++){
				if(n%i == 0)
					return false;
			}
			return true;
		}
	}

}
