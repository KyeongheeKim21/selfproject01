package algorithmicProblemSolvingStrategies;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No14284 {
	public static final int INF = 101; 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nodes = br.readLine().split(" ");
		int n = Integer.parseInt(nodes[0]);
		int m = Integer.parseInt(nodes[1]);
		int[][] map = new int[n][n];
		int[] dis = new int[n];
		boolean[] visit = new boolean[n];
		for(int[] ma:map) {
			Arrays.fill(ma, INF);
		}
		for(int i = 0; i < n;i++) {
			map[i][i] = 0;
		}
		for(int i = 0; i < m;i++) {
			nodes = br.readLine().split(" ");
			int a = Integer.parseInt(nodes[0])-1;
			int b = Integer.parseInt(nodes[1])-1;
			int c = Integer.parseInt(nodes[2]);
			
			map[a][b] = c;
			map[b][a] = c;
		}
		nodes = br.readLine().split(" ");
		int s = Integer.parseInt(nodes[0])-1;
		int t = Integer.parseInt(nodes[1])-1;
		for(int i = 0; i <n ; i++) {
			dis[i] = map[s][i];
		}
		/*for(int tm:dis) {
			System.out.print(tm+" ");
		}System.out.println();*/
		
		visit[s] = true;
		
		
		for(int i = 0;i < n-2;i++) {
			int idx = -1;
			int min = INF;
			for(int j =0; j < n; j++) {
				if(dis[j] < min && !visit[j]) {
					min = dis[j];
					idx = j;
				}
			}
			visit[idx] = true;
			for(int j =0; j < n; j++) {
				if(!visit[j] ) {
					if(dis[j] > dis[idx] + map[idx][j]) {
						dis[j] = dis[idx] + map[idx][j];
					}
				}
			}
			
		}
		/*for(int tm:dis) {
			System.out.print(tm+" ");
		}System.out.println();*/
		System.out.println(dis[t]);
	}
}