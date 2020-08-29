package code2858;
import java.io.*;

public class solution {
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input ;
		input = br.readLine();
		System.out.println("input: "+input);
		int cnt = 0;
		long answer = 0;
		
		
		for(int i = 0; i<input.length() ; i++) {
			
			if(input.charAt(i) == '(' && input.charAt(i+1) == ')') {
				//if(cnt-- < 0) cnt=0;
				answer += cnt;
				i++;
				continue;
			}
			else if( input.charAt(i) == '(') {// '()'
				cnt++;
			}
			else if(input.charAt(i) == ')') {
				cnt--;
				answer++;
			}
			else {
				break;
			}
		}
		System.out.println("answer: "+answer);
	}

}
/*다른 사람 코드 https://whereisusb.tistory.com/ 
import java.util.Scanner;
import java.util.Stack;
 
public class solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        String t = sc.next();
        int answer = 0;
        for(int i=0;i<t.length();i++){
        	if( t.charAt(i) == '\n') {
        		break;
        	}
        	else if(t.charAt(i)=='('){
                if(t.charAt(i+1)==')'){
                    i++;
                    answer += stack.size();
                    continue;
                }
                // 막대기 개수 +1
                stack.push(1);
            }else{
                // 막대기 개수 -1
                stack.pop();
                // 총 막대 개수 +1
                answer++;
            }
        }
        System.out.println(answer);
    }
}
*/