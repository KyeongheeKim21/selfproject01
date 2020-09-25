package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class No10799 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		int ans = 0;
		for(int i = 0; i < str.length()-1;i++) {
			if(str.charAt(i) == '(') {
				if(str.charAt(i+1) == ')') {
					ans += stack.size();
					i++;
				}
				else stack.push('(');
			}
			else {
				stack.pop();
				ans++;
			}
		}
		if(stack.size() != 0) ans++;
		bw.write(ans+"\n");
		bw.flush();
	}
}