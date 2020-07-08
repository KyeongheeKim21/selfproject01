package algorithmicProblemSolvingStrategies;

import java.util.*;

public class No1260_array {//백준 통과
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int start = scan.nextInt()-1;
		boolean[][] line = new boolean[N][N];
		boolean[] visit = new boolean[N];
		
		for(int i = 0; i < M ;i++) {
			int a = scan.nextInt() -1;//배열은 0부터 시작
			int b = scan.nextInt() -1;
			
			
			line[a][b] = true;
			line[b][a] = true;
		}
		scan.close();
		
		//dfs depth first search
		//stack
		Stack<Integer> st = new Stack<>();
		st.push(start);
		System.out.print((start+1)+" ");
		visit[start] = true;
		boolean stillVisiting = true;
		while(stillVisiting && !st.empty()) {
			int peek = st.peek();
			boolean newVisit = false;
			for(int i = 0; i < N;i++) {			
				if(line[peek][i] && !visit[i]) {
					visit[i] = true;			
					st.push(i);	
					System.out.print((i+1)+" ");	
					newVisit = true;
					break;
				}
			}
			if(!newVisit) st.pop();
			stillVisiting = false;
			for(boolean v: visit)
				if(v == false) stillVisiting = true;
		}
		System.out.println();
		Arrays.fill(visit, false);
		//bfs breadth first search
		//queue
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		System.out.print((start+1)+" ");
		visit[start] = true;
		stillVisiting = true;
		while(stillVisiting && !q.isEmpty()) {
			int peek = q.poll();
			for(int i = 0; i < N;i++) {			
				if(line[peek][i] && !visit[i]) {
					visit[i] = true;			
					q.offer(i);
					System.out.print((i+1)+" ");
				}
			}
			stillVisiting = false;
			for(boolean v: visit)
				if(v == false) stillVisiting = true;
		}
	}
}
