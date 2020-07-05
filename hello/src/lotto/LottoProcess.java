package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoProcess {
	
	int[] number = new int[6];
	
	LottoProcess(int seed, int[] powerball){
		lottery(seed, powerball);
	}
	private void lottery(int seed, int[] powerball) {
		Random random = new Random(seed);
		
		for(int i = 0; i < 6;i++) {
			int temp = random.nextInt(45) + 1;
			if(Arrays.binarySearch(number, temp) < 0) {
				number[i] = temp;
				powerball[number[i]-1]++;
			}
			else i--;;
		}
		Arrays.sort(number);
	}
	public void show() {
		for(int i : number) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
