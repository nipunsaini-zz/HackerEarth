package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MicroArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int Q = Integer.parseInt(line[1]);
        int[] array = new int[N];
        line = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
        	array[i] = Integer.parseInt(line[i]);
        }
        for(int j = 0; j < Q; j++){
        	line = br.readLine().split(" ");
        	if(line[0].equals("0")){
        		int x = Integer.parseInt(line[1]);
        		int y = Integer.parseInt(line[2]);
        		array[x-1] = y;
        	} else {
        		int v = Integer.parseInt(line[1]);
        		int pos = -1;
        		for(int i = 0; i < N; i++){
        			if(array[i] >= v){
        				pos = i+1;
        				break;
        			}
        		}
        		System.out.println(pos);
        	}
        }

	}

}
