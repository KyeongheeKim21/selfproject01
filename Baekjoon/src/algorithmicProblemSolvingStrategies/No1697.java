package algorithmicProblemSolvingStrategies;
import java.io.*;
public class No1697 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		if(K <= N) {
			System.out.println(N-K);
			return;
		}
		
		int[] dp = new int[2*K+1];
		for(int i = 0; i < N;i++) {
			dp[i] = Math.abs(N-i);
			
		}
		for(int i = N+1; i <=2*K;i++) {
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i-1]+1, (dp[i/2]+1));
				dp[i-1] = Math.min(dp[i-1], dp[i]+1);
			}
			else dp[i] = dp[i-1]+1;
		}
		System.out.println(dp[K]);
	}
}