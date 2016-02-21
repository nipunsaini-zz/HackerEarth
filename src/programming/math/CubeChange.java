/*
Problem Statement:
Chandan gave his son a cube with side N. The N X N X N cube is made up of small 1 X 1 X 1 cubes.
Chandan's son is extremely notorious just like him. So he dropped the cube inside a tank filled with Coke. 
The cube got totally immersed in that tank. His son was somehow able to take out the cube from the tank. 
But sooner his son realized that the cube had gone all dirty because of the coke. 
Since Chandan did not like dirty stuffs so his son decided to scrap off all the smaller cubes that got dirty in the process.
A cube that had coke on any one of its six faces was considered to be dirty and scrapped off. 
After completing this cumbersome part his son decided to calculate volume of the scrapped off material. 
Since Chandan's son is weak in maths he is unable to do it alone.
Help him in calculating the required volume.

Input:
The first line contains T denoting the number of test cases. Then T lines follow each line contains N that is the side of cube.

Output:
For each case output the required volume.

Constraints:

    1 ≤ T ≤ 100
    1 ≤ N ≤ 109

Sample Input
2
1
3

Sample Output
1
26
*/

package programming.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CubeChange {

	public static void main(String[] args) throws Exception {
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
