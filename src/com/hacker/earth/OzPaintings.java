package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OzPaintings {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for(int i = 0; i < T; i++){
        	String[] pens = br.readLine().split(" ");
        	int X = Integer.parseInt(pens[0]);
        	int Y = Integer.parseInt(pens[1]);
        	int Z = Integer.parseInt(pens[2]);
        	long counter = 0;
        	int min = minimum(X, Y, Z);
        	counter = min + (X - min) / 3 + (Y - min) / 3 + (Z - min) / 3;
        	long temp =  (X / 3) + (Y / 3) + (Z / 3);
        	temp += minimum(X % 3, Y % 3, Z % 3);
        	long count = (counter >= temp) ? counter : temp;
        	System.out.println(count);
        	
        }

	}

	private static int minimum(int x, int y, int z) {
		if(x <= y && x <= z)
			return x;
		else if(y <= x && y <= z)
			return y;
		else
			return z;
	}

}
