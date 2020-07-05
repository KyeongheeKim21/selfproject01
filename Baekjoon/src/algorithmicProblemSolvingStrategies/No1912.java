package algorithmicProblemSolvingStrategies;

import java.util.Scanner;

public class No1912 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();
			int[] num = new int[N];
			int[] dp = new int[N];
			for(int i = 0 ; i < N; i++) {
				int x = scan.nextInt();
				num[i] = x;
			}
			scan.close();
			dp[0] = num[0];
			
			for(int i = 1; i < N ; i++) {
				dp[i] = Math.max(dp[i-1]+num[i], num[i]);
			}
			int max = dp[0];
			for(int n : dp) {
				if(max < n) max = n;
			}
			System.out.println(max);
		}
	}
