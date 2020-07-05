package algorithmicProblemSolvingStrategies;

import java.util.Scanner;

public class No2869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long up = scan.nextInt();
		long down = scan.nextInt();
		long top = scan.nextInt();
		top -= down;
		scan.close();
		
		long day = up - down;
		long ans;
		if(top % day != 0) ans = top/day + 1;
		else ans = top/day;
		System.out.println(ans);
	}

}
