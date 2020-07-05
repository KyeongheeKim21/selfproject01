package algorithmicProblemSolvingStrategies;

import java.util.Scanner;

public class No1463 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		if(N == 1) System.out.println(0);
		else if(N == 2) System.out.println(1);
		else if(N == 3) System.out.println(1);
		else {
			int[] dp = new int[N+1];
			dp[1] = 0;
			dp[2] = 1;
			dp[3] = 1;
			for(int i = 4; i <N+1; i++) {
				if(i%2 == 0) dp[i] = dp[i/2]+1;
				else if(i%2 == 1) dp[i] = dp[i-1]+1;
				
				
				if(i%3 == 0) dp[i] = Math.min(dp[i/3]+1,dp[i]);
				else if(i%3 == 1) dp[i] = Math.min(dp[i],dp[i-1]+1);
				else if(i%3 == 2) dp[i] = Math.min(dp[i],dp[i-2]+2);
				
			}
			System.out.println(dp[N]);
		}
	}
}
