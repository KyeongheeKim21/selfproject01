package stepByStep;
import java.util.Scanner;


public class No11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		String line = scan.next();
		int sum = 0;
		scan.close();
		
		for(int i=0; i < x;i++) {
			sum += line.charAt(i) - 48;
		}
		System.out.println(sum);
	}

}
