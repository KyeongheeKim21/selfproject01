package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1932 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n];
		while(n-- > 0) {
			String[] s = br.readLine().split(" ");
			int[] input = new int[s.length];
			int idx = 0;
			for(String ss: s) {
				input[idx++] = Integer.valueOf(ss);
			}
			int[] dpcopy = new int[dp.length];
			idx = 0;
			for(int i : dp) {
				dpcopy[idx++] = i;
			}
			dp[0] += input[0];
			for(int i = 1; i < input.length; i++) {
				dp[i] = Math.max(dpcopy[i] + input[i],dpcopy[i-1] + input[i]);
			}
		}
		int max = -1;
		for(int i : dp) {
			if(max < i) max = i;
		}
		System.out.println(max);
	}

}
