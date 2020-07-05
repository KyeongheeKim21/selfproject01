package algorithmicProblemSolvingStrategies;

import java.util.Scanner;

public class No11726 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		if(N == 1) System.out.println(1);
		else if(N == 2) System.out.println(2);
		else {
			int i =3;
			long n1 = 1, n2 = 2;
			while(i <= N) {
				long sum = (n1 + n2)%10007;
				n1 = n2;
				n2 = sum;
				i++;
			}
			System.out.println(n2);
		}
	}

}
