package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2238 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int max = Integer.valueOf(str[0]) +1;
		int num = Integer.valueOf(str[1]);
		int[] map = new int[max];
		String[] name = new String[max];
		for(int i = 0; i< num; i++) {
			String[] s = br.readLine().split(" ");
			int idx = Integer.valueOf(s[1]);
			map[idx]++;
			if(name[idx] == null)
				name[idx] = s[0];
		}
		int min = num+1;
		int pos = -1;
		for(int i = 0; i< max; i++) {//
			if(map[i] != 0 && map[i] < min) {
				min = map[i];
				pos = i;
			}
		}
		System.out.println(name[pos]+" "+pos);
	}
}