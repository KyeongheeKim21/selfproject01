package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1946 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int[][] rank = new int[2][N+1];
			for(int i = 0; i < N; i++) {
				String[] str = br.readLine().split(" ");
				int rank1 = Integer.parseInt(str[0]);
				int rank2 = Integer.parseInt(str[1]);
				
				rank[0][rank1] = i;
				rank[1][rank2] = i;
			}
			for(int r:rank[0]) {
				System.out.print(r+" ");
			}System.out.println();
			for(int r:rank[1]) {
				System.out.print(r+" ");
			}
			/*int N = Integer.parseInt(br.readLine());
			int[][] score = new int[N][2];
			for(int i = 0; i < N; i++) {
				String[] str = br.readLine().split(" ");
				score[i][0] = Integer.parseInt(str[0]);
				score[i][1] = Integer.parseInt(str[1]);
			}
			int ans = N;
			for(int[] s:score) {
				if(s[0]!= 1 && s[1] != 1) {
					for(int[] c:score) {
					if((s[0] > c[0]) && (s[1] > c[1])) {
						ans--;
						break;
					}
				}
				}
				
			}
			System.out.println(ans);*/
		}
	}
}