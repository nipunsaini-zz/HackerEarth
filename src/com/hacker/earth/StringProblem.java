package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProblem {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int Q = Integer.parseInt(br.readLine());
		for(int i = 0; i < Q; i++){
			String[] line = br.readLine().split(" ");
			String x = line[0];
			String y = line[1];
			int counter = 0;
			counter += getCount(str, x.charAt(0),y.charAt(0));
			System.out.println(counter);
		}

	}

	private static int getCount(String str, char x, char y) {
		int c = 0;
		int rc = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == x){
				for(int j = str.indexOf(y); j < str.length() && j > i; j++){
					if(str.charAt(j) == y)
						c++;
				}
			}
			if(str.charAt(i) == y){
				for(int j = str.indexOf(x); j < str.length()&& j > i; j++){
					if(str.charAt(j) == x)
						rc++;
				}
			}
		}
		return c+rc;
	}

}
