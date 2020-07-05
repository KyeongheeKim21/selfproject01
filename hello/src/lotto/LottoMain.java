package lotto;

import java.util.Scanner;
import java.util.Vector;
import lotto.LottoProcess;

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
		
		System.out.println("중심 값을 입력하세요. 입력이 완료되면 -1을 입력하세요.");
		int seed;
		Vector<LottoProcess> list = new Vector<LottoProcess>();
		
		while((seed = scan.nextInt()) != -1) {
			if(seed > 45 ) seed = seed % 45;
			list.add(new LottoProcess(seed, powerball));
		}
		
		for(LottoProcess i : list) {
			i.show();
		}
		showPowerball();
	}

}
