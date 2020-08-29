package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11403 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v = Integer.parseInt(br.readLine());
		int[][] map = new int[v][v];
		for(int i = 0; i < v; i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < v;j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int k = 0; k < v;k++) {
			for(int i = 0; i < v;i++) {
				for(int j = 0;j < v;j++) {
					if(map[i][k] == 1 && map[k][j] == 1) {
						map[i][j] = 1;
					}
				}
			}
		}
		for(int[] m: map) {
			for(int e: m) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}
}