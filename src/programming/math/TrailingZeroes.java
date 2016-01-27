package programming.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrailingZeroes {
	
	public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int divider = 5;
        int count = 0;
        while(divider < N){
        	count += N / divider;
        	divider *= 5;
        }
        
       
        System.out.println(count);
    }

}
