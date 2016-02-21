package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FairShare {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line.trim());
        for(int t=0; t<T; t++){
        	line  = br.readLine();
            String[] arr = line.trim().split(" ");
            int N = Integer.parseInt(arr[0]);
            int Q = Integer.parseInt(arr[1]);
            String[] names = new String[N];
            int[] shares = new int[N];
            for(int i =0; i<N; i++){
            	names[i] = br.readLine().trim();
            }
            for(int j=0; j<Q; j++){
            	String name = br.readLine().trim();
            	int amount = Integer.parseInt(br.readLine().trim());
            	int M = Integer.parseInt(br.readLine().trim());
            	            	
            	int eachShare = amount/(M+1);
            	
            	for(int k=0; k<M;k++){
            		String tempName = br.readLine().trim();
            		for(int s=0; s<names.length;s++){
            			if(names[s].equals(tempName))
            				shares[s] -= eachShare; 
            		}      
            	}
            	for(int s=0; s<names.length;s++){
        			if(names[s].equals(name))
        				shares[s] += (eachShare*M); 
        		} 
            }
            
            for(int k=0; k<names.length;k++){
            	String query = names[k];
            	int a = shares[k];
            	if(a > 0)
            		query += " is owed " + a;
            	else if(a < 0)
            		query += " owes " + (-a);
            	else
            		query += " neither owes nor is owed";
            	System.out.println(query);
            }

        }
                

	}
	

}
