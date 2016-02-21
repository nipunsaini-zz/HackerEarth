package com.hacker.earth.worldcodesprint;

import java.util.Scanner;

public class FlatlandSpaceStations {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int max = 0;//Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
        	int min = Integer.MAX_VALUE;
        	for(int j = 0; j < m; j++){
        		if(i == c[j]){
        			min = 0;
        			break;
        		}
        		int d = Math.abs(i - c[j]);
        		if(min > d)
        			min = d;
        	}
        	if(max < min)
        		max = min;
        }
        System.out.println(max);
        in.close();
    }	

}
