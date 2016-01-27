package programming.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CubeChange {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            long volume = 0;
            if(N == 1)
            	volume = 1;
            if(N > 1)
            	volume = (long)6 * (N - 2) * N + 8;
            System.out.println(volume);
        }

	}

}
