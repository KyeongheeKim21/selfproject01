package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2163 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		int N = Integer.parseInt(num[0]);
		int M = Integer.parseInt(num[1]);
		System.out.println( Math.min((N-1)*M + (M-1), N*(M-1) + (N-1)));
	}
}