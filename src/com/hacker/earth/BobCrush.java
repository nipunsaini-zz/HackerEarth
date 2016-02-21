package com.hacker.earth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class BobCrush {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
		String[] arr = line.trim().split(" ");
		int N = Integer.parseInt(arr[0]);
		int Q = Integer.parseInt(arr[1]);
		int k = Integer.parseInt(arr[2]);
		line = br.readLine();
		arr = line.trim().split(" ");
		List<Integer> list  = new ArrayList<Integer>();
		for(String number : arr){
			list.add(Integer.parseInt(number));
		}
		for(int i = 0; i < Q; i++){
			line = br.readLine();
			arr = line.trim().split(" ");
			if(arr[0].equals("0")){
				int x = Integer.parseInt(arr[1]);
				int y = Integer.parseInt(arr[2]);
				list.set(x-1, y);
			}
			else{
				int a = Integer.parseInt(arr[1]);
				int b = Integer.parseInt(arr[2]);
				int c = Integer.parseInt(arr[3]);
				int d = Integer.parseInt(arr[4]);
				List<Integer> list1 = new ArrayList<Integer>();
				for(int n : list){
					if(n >= a && n <= b && n >= c && n <= d)
						list1.add(n);
				}
				int m = list1.size();
				if(m >= k)
					System.out.println("Propose");
				else
					System.out.println("Do not propose");
			}
				
		}
		
		

	}

}
