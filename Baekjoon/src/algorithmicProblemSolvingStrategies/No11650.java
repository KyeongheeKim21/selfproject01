package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class No11650 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[t][2];
		for(int i = 0; i < t; i++) {
			String[] tmp = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(tmp[0]);
			arr[i][1] = Integer.parseInt(tmp[1]);
		}
		Arrays.sort(arr,(o1,o2)->{
			if(o1[0] == o2[0])
				return Integer.compare(o1[1], o2[1]);
			else 
				return Integer.compare(o1[0], o2[0]);
		});
		for(int[] a: arr) {
			bw.write(a[0]+" "+a[1]+"\n");
		}
		bw.flush();
	}
}