package com.hacker.earth.worldcodesprint;

import java.util.Scanner;

public class MarsExploration {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        for(int i = 0; i < S.length(); i++){
        	if((i % 3 == 0 || i % 3 == 2) && S.charAt(i) != 'S')
        		count++;
        	if(i % 3 == 1 && S.charAt(i) != 'O')
        		count++;
        }
        System.out.println(count);
        in.close();
    }

}
