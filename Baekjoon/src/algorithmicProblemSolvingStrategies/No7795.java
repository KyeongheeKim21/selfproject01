package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No7795 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Tc = Integer.parseInt(br.readLine());
		while(Tc-- > 0) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			int[] A = new int[N];
			int[] B = new int[M];
			str = br.readLine().split(" ");
			for(int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(str[i]);
			}
			str = br.readLine().split(" ");
			for(int i = 0; i < M; i++) {
				B[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(A);
			Arrays.sort(B);
			int ans = 0;
			for(int i:A) {
				int min = 0;
				int max = M-1;
				while(min != max) {
					int mid = (min + max)/2;
					if(i > B[mid]) {
						min = mid+1;
					}else {
						max = mid;
					}
				}
				//System.out.println(i+" "+B[min]+" "+min);
				if(i > B[min]) {
					ans+= min+1;//System.out.println(min-1);
				}
				else if(i == B[min]) ans += min;
				else if(i < B[min]) ans+= min;
				
			}
			System.out.println(ans);
		}
	}

}
