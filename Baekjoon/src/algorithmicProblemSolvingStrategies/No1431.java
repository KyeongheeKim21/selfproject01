package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class No1431 {
		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		String[] gital = new String[t];
		for(int i = 0; i < t; i++) {
			String str = br.readLine();
			gital[i] = str;
		}
		Arrays.sort(gital,(o1,o2)->{
			int one = o1.length();
			int two = o2.length();
			if(one == two) {
				int s = 0, s2 = 0;
				for(int i = 0; i < one;i++) {
					String str = o1.charAt(i)+"";
					if(str.toUpperCase() == str.toLowerCase()) {
						int x = Integer.parseInt(str);
						if( x >=0 && x <= 9) s += x;
					}
					str = o2.charAt(i)+"";
					if(str.toUpperCase() == str.toLowerCase()) {
						int x = Integer.parseInt(str);
						if( x >=0 && x <= 9) s2 += x;
					}
				}
				if(s == s2) {
					return o1.compareTo(o2);
				}
				else return Integer.compare(s, s2);
			}
			else return Integer.compare(one, two);
		});
		for(String g: gital) {
			bw.write(g+"\n");
		}
		bw.flush();
	}
}