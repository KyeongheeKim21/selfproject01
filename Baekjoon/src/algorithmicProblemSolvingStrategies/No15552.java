package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No15552 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(str.nextToken())+ Integer.parseInt(str.nextToken())+"\n");
		}
		bw.flush();
	}
}