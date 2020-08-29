package hello;

import java.util.Scanner;

public class hey {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = scan.nextInt();
				score = new int[studentNum];
				break;
			case 2:
				for(int i = 0; i< studentNum; i++) {
					System.out.print("score[" + i + "]> ");
					score[i] = scan.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i< studentNum; i++) {
					System.out.println("score[" + i + "]> " + score[i]);
				}
				break;
			case 4:
				int max = 0, sum = 0;
				for(int i = 0; i< studentNum; i++) {
					if(max < score[i])max = score[i];
					sum += score[i];
				}
				System.out.println("최고 점수: "+max);
				System.out.println("평균점수: "+ (double)(sum/studentNum));
				break;
			case 5:
				run = false;
				break;
			default:
					break;
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
	}

}