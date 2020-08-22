package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9095 {

	public static void main(String[] args) throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int answer = 0;
		int[] dp = new int[12];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int ptr = 4;
			if(n == 1) answer = dp[1];
			else if(n == 2) answer = dp[2];
			else if(n == 3) answer = dp[3];
			else {
				ptr--;
				while(ptr != n) {
					ptr++;
					dp[ptr] = dp[ptr - 3] + dp[ptr-2] + dp[ptr-1];
				}
				answer = dp[ptr];
			}
			System.out.println(answer);
		}
	}

}
