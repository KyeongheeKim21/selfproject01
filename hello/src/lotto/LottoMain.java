package lotto;

import java.util.Scanner;
import java.util.Vector;

public class LottoMain {
	
	static public int[] powerball = new int[45];
	
	static public void showPowerball() {
		for(int i = 0;i<45;i++) {
			System.out.printf("%2d ",i+1);
		}
		
		System.out.println();
		
		for(int i : powerball) {
			System.out.printf("%2d ",i);
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�߽� ���� �Է��ϼ���. �Է��� �Ϸ�Ǹ� -1�� �Է��ϼ���.");
		int seed;
		Vector<LottoProcess> list = new Vector<LottoProcess>();
		
		while((seed = scan.nextInt()) != -1) {
			if(seed > 45 ) seed = seed % 45;
			list.add(new LottoProcess(seed, powerball));
		}
		scan.close();
		for(LottoProcess i : list) {
			i.show();
		}
		showPowerball();
	}

}
