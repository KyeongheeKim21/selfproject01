package stepByStep;
import java.util.Scanner;

public class No2588{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int no1 = scan.nextInt();
		int no2 = scan.nextInt();
		scan.close();
		System.out.println(no1 * (no2%10));
		System.out.println(no1 * (no2%100)/10);
		System.out.println(no1 * (no2/100));
		System.out.println(no1 * no2);
		
		/*int[] mul = new int[3];
		int[] sum = new int[4];
		
		mul[0] = no2 % 10;
		mul[1] = (no2 % 100) / 10;
		mul[2] = no2 / 100;
		
		for(int i = 0; i < 3; i++) {
			int pos;
			for(pos = 0; mul[i] != 1; pos++) {
				if(mul[i] %2 == 1) {
					sum[i] += no1 << pos;
				}
				mul[i] /= 2;
			}
			sum[i] += no1 <<pos;
		}
		for(int i = 0,j = 1 ;i<3;i++,j*=10) {
			System.out.println(sum[i]);
			sum[3] += sum[i] *j ;
		}
		System.out.println(sum[3]);*/
	}

}
