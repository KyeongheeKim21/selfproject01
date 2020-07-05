package algorithmicProblemSolvingStrategies;

import java.util.Scanner;

public class No2579 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] stare = new int[N];
		for(int i = 0; i < N; i ++) stare[i] = scan.nextInt();
		scan.close();
		
		int[][] dp = new int[N][3];
		dp[0][0] = 0;
		dp[0][1] = stare[0];
		dp[0][2] = stare[0];
		
		for(int i = 1; i < N; i++) {
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]);//x
			dp[i][1] = dp[i-1][2]+ stare[i];//oo
			dp[i][2] = dp[i-1][0]+ stare[i];//xo
		}
		
		System.out.println(Math.max(dp[N-1][1], dp[N-1][2]));
	}

}
