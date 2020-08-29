package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2606 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int computer = Integer.parseInt(br.readLine());
		int[][] gragh = new int[computer][computer];
		int link = Integer.parseInt(br.readLine());
		int answer = 0;
		while(link-- >0) {
			String[] lk = br.readLine().split(" ");
			int i = Integer.valueOf(lk[0]) - 1;
			int j = Integer.valueOf(lk[1]) - 1 ;
			gragh[i][j] = 1;
			gragh[j][i] = 1;
		}
		for(int k = 0; k < computer;k++) {
			for(int i = 0; i < computer;i++) {
				for(int j = 0; j < computer;j++) {
					if(gragh[i][k] == 1 && gragh[k][j]== 1) {
						gragh[i][j] = 1;
					}
				}
			}
		}
		for(int i = 1; i < computer;i++) {
			if(gragh[0][i] == 1) answer++;
		}
		System.out.println(answer);/**/
	}

}
