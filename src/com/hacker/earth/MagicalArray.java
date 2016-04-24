package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MagicalArray {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
			String[] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int X = Integer.parseInt(line[1]);
			String[] arrayString = br.readLine().split(" ");
			int[] magicalArray = new int[N];
			int counter = 0;
			magicalArray[0] = Integer.parseInt(arrayString[0]);
			for(int j = 1; j < N; j++){
				int num = Integer.parseInt(arrayString[j]);
				int arrNum = magicalArray[j-1];
				if(num <= arrNum){
					int diff = arrNum + 1 - num;
					int c;
					if(diff % X == 0){
						c = diff / X;
					}else{
						c = (int)Math.ceil((double) diff / X);						
					}
					num += c * X;
					counter += c;		
					magicalArray[j] = num;
				}else{
					magicalArray[j] = num;
				}
			}
			System.out.println(counter);
		}
	}

}
