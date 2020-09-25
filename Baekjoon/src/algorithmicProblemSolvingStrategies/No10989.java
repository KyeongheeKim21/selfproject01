package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10989 {
	public static int[] tmp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int max = -1;
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			arr[i] = tmp;
			if(max < tmp)max = tmp;
		}
		arr = countingsort(arr,max);
		for(int a:arr) {
			bw.write(a+"\n");
		}
		bw.flush();
	}
	public static int[] countingsort(int[] arr,int max) {
		int[] count = new int[max+1];
		int[] sorted = new int[arr.length];
		int idx = 0;
		for(int a:arr) {
			count[a]++;
		}
		for(int i = 1;i < max+1;i++) {
			while(count[i]-- > 0) {
				sorted[idx++] = i;
			}
		}
		return sorted;
	}
}