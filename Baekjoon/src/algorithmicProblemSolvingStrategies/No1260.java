package algorithmicProblemSolvingStrategies;

import java.util.*;

public class No1260 {//백준 시간초과(제한 2초)
	public static final int INF = 1010;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int start = scan.nextInt();
		ArrayList<int[]> line = new ArrayList<>();
		ArrayList<Integer> dfs = new ArrayList<>();
		ArrayList<Integer> bfs = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			int[] arr = new int[N];
			Arrays.fill(arr, INF);
			line.add(arr);
		}
		for(int i = 0; i < M ;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			for(int idx = 0; idx < line.get(a-1).length;idx++) {
				if(line.get(a-1)[idx] == INF) {
					line.get(a-1)[idx] = b;
					break;
				}
			}
			for(int idx = 0; idx < line.get(b-1).length;idx++) {
				if(line.get(b-1)[idx] == INF) {
					line.get(b-1)[idx] = a;
					break;
				}
			}
		}
		scan.close();
		
		for(int[] a: line) {
			Arrays.sort(a);
		}
		
		//dfs depth first search
		//stack
		Stack<Integer> st = new Stack<>();
		st.push(start);
		System.out.print(start+" ");
		dfs.add(start);
		while(dfs.size() < N && !st.empty()) {
			int peek = st.peek();
			for(int i = 0; i < N;i++) {			
				int next = line.get(peek - 1)[i];			
				if(next == INF) break ;
				if(!dfs.contains(next)) {				
					st.push(next);	
					dfs.add(next);
					System.out.print(next+" ");
					break;			
				}
				else if(line.get(peek - 1)[i+1] == INF) st.pop();
			}
		}
		//for(Integer a: dfs) {
		//	System.out.print(a+" ");
		//}
		System.out.println();
		
		//bfs breadth first search
		//queue
		
		Queue<Integer> q = new LinkedList<>();
		bfs.add(start);
		System.out.print(start+" ");
		for(int i = 0; i < N; i++) {
			int next = line.get(start - 1)[i];
			if(line.get(start - 1)[i] != INF) {
				q.offer(next);
				bfs.add(next);
				System.out.print(next+" ");
			}
			else if(next == INF) break;
		}
		while(bfs.size() < N && !q.isEmpty()) {
			int peek = q.poll();		
				for(int i = 0; i < N; i++) {
					int next = line.get(peek - 1)[i];
					if(next != INF
							&& !bfs.contains(next)) {
						q.offer(next);
						bfs.add(next);
						System.out.print(next+" ");
					}
					else if(next == INF) break;
				}
		}
		//for(Integer a: bfs) {
		//	System.out.print(a+" ");
		//}
	}
}
