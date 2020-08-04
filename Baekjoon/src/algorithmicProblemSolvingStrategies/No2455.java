package algorithmicProblemSolvingStrategies;

import java.util.Scanner;

public class No2455 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int people = scan.nextInt();// 무조건 0
		int max = scan.nextInt();// 출발역 탑승인원
		int current = max;
		for(int i = 0 ; i < 6; i++) {
			//2정류장 부터
			people = scan.nextInt();
			if(i%2 == 0) current -= people;
			else{
				current += people;
				if(max < current) max = current;
			}
		}
		scan.close();
		System.out.println(max);
	}

}
