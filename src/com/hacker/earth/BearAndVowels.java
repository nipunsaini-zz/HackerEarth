package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BearAndVowels {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
			String str = br.readLine();
			int vowelCount = 0;
			int consonantCount = 0;
			String result = "easy";
			Pattern p = Pattern.compile("[aeiouy]");
			Matcher m = p.matcher(str);
			while(m.find()){
				vowelCount++;
			}
			consonantCount = str.length() - vowelCount;
			if(consonantCount > vowelCount)
				result = "hard";
			else{
				p = Pattern.compile("[^aeiouy]{3}");
				m = p.matcher(str);
				if(m.find()){
					result = "hard";
				}
			}
			System.out.println(result);			
		}
	}

}
