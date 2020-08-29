package page180;

import java.util.Scanner;

public class Hanoi {
	
	static void move(int ring, int start,int next) {
		if(ring == 2) {
			System.out.println("����" + (ring-1) + "�� " + start + "���� " + (6-start-next) + "�� �ű�");
			System.out.println("����" + ring + "�� " + start + "���� " + next + "�� �ű�");
			System.out.println("����" + (ring-1) + "�� " + (6-start-next) + "���� " + next+ "�� �ű�");
		}
		else {
			move(ring-1,start,6-start-next);
			System.out.println("����" + ring + "�� " + start + "���� " + next + "�� �ű�");
			move(ring-1,6-start-next,next);
		}
		//System.out.println("����" + ring + "�� " + start + "���� " + next + "�� �ű�");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("�ϳ��� ž");
			System.out.println("���� ���� : ");
			int ring = stdIn.nextInt();
			stdIn.close();
			move(ring,1,3);
			System.out.println("��!!");
	}

}
