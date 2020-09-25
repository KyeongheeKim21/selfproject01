package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1026 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
		String[] s = br.readLine().split(" ");
		String[] s2 = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(s[i]);
			B[i] = Integer.parseInt(s2[i]);
		}
		Arrays.sort(A);
		Arrays.sort(B);
		int ans = 0;
		for(int i = 0,j=N-1; i <N; i++) {
			ans += A[i]*B[j--];
		}
		System.out.println(ans);
	}
}