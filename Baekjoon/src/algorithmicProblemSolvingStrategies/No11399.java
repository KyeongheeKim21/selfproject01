package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No11399 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		int[] spend = new int[tc];
		int ans = 0;int i = 0;
		StringTokenizer st = new StringTokenizer( br.readLine());
		while(st.hasMoreTokens()) {
			spend[i++] = Integer.parseInt(st.nextToken());
		}
		Arrays.parallelSort(spend);
		for(int s: spend) {
			ans += s*tc;
			tc--;
		}
		bw.write(ans+"\n");
		bw.flush();
	}
}