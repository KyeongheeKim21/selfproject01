package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2751 {
	public static int[] tmp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		mergesort(arr,0,N-1);
		for(int a:arr) {
			bw.write(a+"\n");
		}
		bw.flush();
	}
	public static void mergesort(int[] arr,int start, int end){
		if(start < end) {
			int mid = (start + end) / 2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	public static void merge(int[] arr,int start,int mid, int end) {
		tmp = new int[end-start+1];
		int idx = 0;
		int l = start, r = mid+1;
		while(l < mid+1 && r < end+1) {
			tmp[idx++] = arr[l] <= arr[r] ? arr[l++] : arr[r++];
		}
		if(l == mid+1) {
			while(r < end+1) {
				tmp[idx++] = arr[r++];
			}
		}
		else if( r == end+1) {
			while(l < mid+1) {
				tmp[idx++] = arr[l++];
			}
		}
		idx = start;
		for(int t:tmp) {
			arr[idx++] = t;
		}
	}
}