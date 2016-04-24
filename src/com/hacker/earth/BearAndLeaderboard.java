package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BearAndLeaderboard {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		long[] points = new long[n];
		for(int i = 0; i < q; i++){
			String[] query = br.readLine().split(" ");
			int a = Integer.parseInt(query[0]) - 1;
			int b = Integer.parseInt(query[1]);
			points[a] += b;
			printHash(points, n);
		}
		
	}
	
	public static void printHash(long[] points, int length){
		long[] array = points.clone();
		Arrays.sort(array);
		int rank = 1;
		long lastElement = (long)array[array.length-1];
		long sum = 0;
		for(int i = array.length-1; i >= 0; i--){
			long element = (long)array[i];
			if(lastElement != element)
				rank = array.length - i;
			lastElement = element;
			sum += element * rank;
			if(element == 0)
				break;
		}
		System.out.println(sum);
	}
	
}
