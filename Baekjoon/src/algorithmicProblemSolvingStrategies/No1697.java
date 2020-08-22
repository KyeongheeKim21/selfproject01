package algorithmicProblemSolvingStrategies;
import java.io.*;
public class No1697 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		if( N < 0 && N > 100000 && K <0 && K > 100001) {
			System.out.println(0);
			return;
		}
		if( K < N ) {
			int t = K;
			K = N;
			N = t;
		}
		int max = K+N;
		/*if(N==0) max++;
		while(max < K) max *= 2;
		max += 1;*/
		int[] time = new int[max];
		for(int i = N+1; i< max; i++) time[i] = i-N;
		for(int i = N-1; i > -1; i--) time[i] = time[i+1]+1;
		
		/*for(int t:time) System.out.print(t+" ");
		System.out.println();*/
		if(N == 0) N += 1;
		for(int i = 0; i*2 < max; i++) {
			time[i*2] = Math.min(time[i*2], time[i]+1);
			int temp = i*2;
			for(int j = temp+1; j < temp*2 && j < max; j++) {
				time[j] = Math.min(time[j], time[j-1]+1);
			}
			while(--temp > i){
				if(time[temp] == time[temp+1] +1) break;
				time[temp] = Math.min(time[temp] , time[temp+1] +1);
			}
		}
		
		/*for(int t:time) System.out.print(t+" ");
		System.out.println();*/
		
		System.out.println(time[K]);
	}
}