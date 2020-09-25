package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class No2839 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		Arrays.fill(dp, -1);
		if(N < 3 || N > 5000) bw.write("-1\n");
		else {//if(N > 5){
			if(N >= 3)dp[3] = 1;
			if(N >= 5)dp[5] = 1;
			if(N > 5) {
				
				for(int i = 6; i < N+1;i++) {
					int a = dp[i-3];
					int b = dp[i-5];
					if(a == -1) {
						if(b != -1) dp[i] = b+1;
					}
					else {
						if(b == -1) dp[i] = a+1;
						else dp[i] = Math.min(a+1, b+1);
					}
				}
			}
			bw.write(dp[N]+"\n");
		}
		bw.flush();
	}
}