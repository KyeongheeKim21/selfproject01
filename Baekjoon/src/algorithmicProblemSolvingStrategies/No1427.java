package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class No1427 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split("");
		Integer[] arr = new Integer[str.length];
		int idx = 0;
		for(String s: str) {
			arr[idx++] = Integer.parseInt(s);
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(Integer i: arr) {
			bw.write(i+"");
		}
		bw.write("\n");
		bw.flush();
	}
}