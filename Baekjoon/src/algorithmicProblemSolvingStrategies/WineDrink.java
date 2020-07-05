package algorithmicProblemSolvingStrategies;

import java.util.Scanner;

public class WineDrink {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int glass = scan.nextInt();
		int[] glasses = new int[glass];
		int[][] dp = new int[glass][3];
		for(int i = 0 ;i<glass; i++) {
			glasses[i] = scan.nextInt();
		}
		scan.close();
		
		/*[i][0] -> ..x
		 * [i][1] -> xoo
		 * [i][2] -> .xo*/
		dp[0][0] = 0;
		dp[0][1] = glasses[0];
		dp[0][2] = glasses[0];
		
		for(int i = 1; i < glass ; i++) {
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
			dp[i][0] = Math.max(dp[i][0], dp[i-1][2]);
			dp[i][1] = dp[i-1][2] + glasses[i];
			dp[i][2] = dp[i-1][0] + glasses[i];
		}
		int ans = Math.max(dp[glass-1][0], dp[glass-1][1]);
		ans = Math.max(dp[glass-1][2], ans);
		System.out.println(ans);
	}
}