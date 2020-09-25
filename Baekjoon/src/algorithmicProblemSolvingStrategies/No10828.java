package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No10828 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		while(tc-- > 0) {
			String[] str = br.readLine().split(" ");
			int output = -2;
			switch(str[0]) {
			case "pop":
				if(st.isEmpty()) output = -1;
				else output = st.pop();
				break;
			case "push":
				st.push(Integer.parseInt(str[1]));
				break;
			case "top":
				if(st.isEmpty()) output = -1;
				else output = st.peek();
				break;
			case "size":
				output = st.size();
				break;
			case "empty":
				output = st.isEmpty() ? 1: 0;
				break;
			}
			if(output != -2) System.out.println(output);
		}
	}
}