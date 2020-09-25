package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No1197 {
static int[] visit;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int V = Integer.parseInt(str[0]);
		int E = Integer.parseInt(str[1]);
		visit = new int[V];
		for(int i = 0;i < V;i++) {
			visit[i] = i;
		}
		int[][] edge = new int[E][3];
		int sum = 0;
		for(int i = 0; i < E;i++) {
			str = br.readLine().split(" ");
			edge[i][0] = Integer.parseInt(str[0])-1;
			edge[i][1] = Integer.parseInt(str[1])-1;
			edge[i][2] = Integer.parseInt(str[2]);
		}
		Arrays.sort(edge,Comparator.comparingLong(o1->o1[2]));
		for(int[] x: edge) {
			int xroot = find(x[0]);
			int yroot = find(x[1]);
			if(xroot != yroot) {
				sum += x[2];
				visit[yroot] = x[0];
			}
			/*for(int i: visit) {
				System.out.print(i+" ");
			}
			System.out.println();*/
		}
		System.out.println(sum);
	}
	public static int find(int x) {
		if(visit[x] == x) return x;
		else return visit[x] = find(visit[x]);
	}
}/*
5 6
1 2 1
2 3 2
1 3 3
3 4 -1000000
3 5 5
4 5 7*/