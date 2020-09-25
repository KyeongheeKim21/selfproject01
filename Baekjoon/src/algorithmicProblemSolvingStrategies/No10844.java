package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class No10844 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long[] dp = new long[10];
		long[] tmp = new long[10];
		int tc = Integer.parseInt(br.readLine());
		Arrays.fill(dp, 1);
		//dp[0] = 0;
		for(int i = 1;i < tc;i++) {
			tmp[0] = dp[1];
			for(int j = 1; j < 9;j++) {
				tmp[j] = (dp[j-1] + dp[j+1])%1000000000;
			}
			tmp[9] = dp[8];
			int idx = 0;
			for(long t: tmp) {
				dp[idx++] = t;bw.write(t+" ");
			}bw.write("\n");
		}
		long ans = 0;
		for(int i = 1; i < 10;i++) {
			ans += dp[i];
			ans %= 1000000000;
		}
		bw.write(ans+"\n");
		bw.flush();
	}
}