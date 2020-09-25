package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No11727 {
	static int[] dp = new int[1001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(dynamic(n)+"\n");
		bw.flush();
	}
	public static int dynamic(int x) {
		if(x == 1) return 1;
		if(x == 2) return 3;
		if(dp[x] != 0) return dp[x];
		return dp[x] = (dynamic(x-1)+ 2 * dynamic(x-2))%10007;
	}
}