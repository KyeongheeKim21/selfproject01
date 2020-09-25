package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class No1181 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		ArrayList<String> distinct = new ArrayList<>();
		for(int i = 0; i < t;i++) {
			String str = br.readLine();
			if(!distinct.contains(str)) {
				distinct.add(str);
			}
		}
		String[] arr = new String[distinct.size()];
		for(int i = 0; i < arr.length;i++) {
			arr[i] = distinct.get(i);
		}
		Arrays.sort(arr,(o1,o2)->{
			int len = o1.length() - o2.length();
			if(len != 0) return len;//오름차순
			else return o1.compareTo(o2);
		});
		for(String s: arr) bw.write(s+"\n");
		bw.flush();
	}
}