package com.hacker.earth;

public class Add {
	
	public void add(int... n){
		int sum = 0;
		String query = "";
		
		for(int number : n){
			sum += number;
			if(number != n[n.length - 1])
				query += number + "+";
			else
				query += number + "=";
		}
		
		System.out.println(query+sum);
	}
	
	

}
