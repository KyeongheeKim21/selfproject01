package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1065 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			int tmp = i;
			if(i < 100) ans++;
			else if(i < 1000) { // 100 <= N < 1000
				int hundred = tmp / 100;
				tmp %= 100;
				int ten = tmp / 10;
				tmp %= 10;
				int one = tmp;
				if((ten - hundred) == (one - ten))ans++;
			}
		}
		System.out.println(ans);
	}

}
