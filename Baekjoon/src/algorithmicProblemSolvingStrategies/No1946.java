package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1946 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int[][] score = new int[N][2];
			for(int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				score[i][0] = Integer.parseInt(st.nextToken());
				score[i][1] = Integer.parseInt(st.nextToken());
			}
			//int[][] rank = new int[N][N];
			int ans = N;
			for(int i = 0; i < N; i ++) {
				for(int j = 0; j < N; j++) {
					if(i != j) {
						if(score[i][0] > score[j][0] && score[i][1] > score[j][1]) {
							ans--;
							break;
						}
					}
				}
			}
			bw.write(ans+"\n");
		}
		bw.flush();
	}
}