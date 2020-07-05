package algorithmicProblemSolvingStrategies;

import java.util.Arrays;
import java.util.Scanner;

public class Main_no1890 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		/*if(N < 4) {
			System.out.println(0);
			return;
		}*/
		int[][] arr = new int[N][N];
		long[][] dp = new long[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				int t = scan.nextInt();
				arr[i][j] = t;
			}
		}
		scan.close();
		for(int i = 0; i < N; i++) {
			Arrays.fill(dp[i], 0);
		}
		
		dp[0][0] = 1;
		for(int i = 0;i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(dp[i][j] != 0) {
					int t  = arr[i][j];
					if(i == N-1 && j == N-1)continue;
					if(t != 0 && i+t <N) dp[i+t][j] += dp[i][j];
					if(t != 0 && j+t <N) dp[i][j+t] += dp[i][j];
				}
			}
		}
		System.out.println(dp[N-1][N-1]);
	}
}