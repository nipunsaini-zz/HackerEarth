package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GridCount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        String[] arr = line.split(" ");
        int N = Integer.parseInt(arr[0]);
        int K  = Integer.parseInt(arr[1]);
        int[][] matrix = new int[N][N];
        for(int i=0; i<N;i++){
        	line = br.readLine().trim();
        	arr = line.split(" ");
        	for(int j=0; j<N; j++){
        		matrix[i][j] = Integer.parseInt(arr[j]);
        	}
        }
        int count = 0;
        for(int row=0; row<= (N-K); row++){
        	for(int col=0; col<=(N-K); col++){
        		long sum = 0;
        		for(int r=row; r<=row+K-1;r++){
        			for(int c=col; c<=col+K-1;c++){
        				sum += matrix[r][c];
        			}
        		}
        		if(isPerfectCube(sum))
        			count++;
        	}
        }
        System.out.println(count);

	}
	
	public static boolean isPerfectCube(long number){
		
		if(number==1){
			return true;
		}
		
		for(int i=2;i<=(number/2);i++){
			 if(number%i==0)
	            {
	                if((i*i*i)==number)
	                return true;
	            }
		}
		
		return false;
	}

}
