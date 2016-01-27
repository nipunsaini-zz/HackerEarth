package programming.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyPrime {
	
	public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String arr[] = br.readLine().split(" ");
        int S[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(arr[i]);
        }
        
        for(int j = 0; j < N; j++){
        	int number = S[j];
        	int k = 0;
        	for(k = 0; k < N; k++){
        		if(j!=k && number%S[k] == 0){
        			break;
        		}
        	}
        	if(k == N)
        	System.out.print(number + " ");
        }

        
    }

}
