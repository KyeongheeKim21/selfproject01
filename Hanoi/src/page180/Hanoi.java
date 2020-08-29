package page180;

import java.util.Scanner;

public class Hanoi {
	
	static void move(int ring, int start,int next) {
		if(ring == 2) {
			System.out.println("원반" + (ring-1) + "를 " + start + "에서 " + (6-start-next) + "로 옮김");
			System.out.println("원반" + ring + "를 " + start + "에서 " + next + "로 옮김");
			System.out.println("원반" + (ring-1) + "를 " + (6-start-next) + "에서 " + next+ "로 옮김");
		}
		else {
			move(ring-1,start,6-start-next);
			System.out.println("원반" + ring + "를 " + start + "에서 " + next + "로 옮김");
			move(ring-1,6-start-next,next);
		}
		//System.out.println("원반" + ring + "를 " + start + "에서 " + next + "로 옮김");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("하노이 탑");
			System.out.println("원반 개수 : ");
			int ring = stdIn.nextInt();
			stdIn.close();
			move(ring,1,3);
			System.out.println("끝!!");
	}

}
