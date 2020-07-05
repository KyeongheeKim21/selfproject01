package hello;

import java.util.Scanner;

//외계인과 용돈기입장 문제 레벨 2
public class goorm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String list = scan.nextLine();
		
		String[] pocket = list.split(" ");
		int[] pocketlist = new int[N];
		int ptr = 0;
		//for(String s: pocket)System.out.println(s);
		for(String s: pocket) {
			if(!s.contentEquals("")) {
				//System.out.println(s);
				pocketlist[ptr++] = Integer.parseInt(s);
			}
		}
		
		
		for(int i = 0;i < M; i++) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			int sum = 0;
			for(int j = start-1; j < end; j++) {
				sum += pocketlist[j];
			}
			if(sum > 0) System.out.println("+"+sum);
			else System.out.println(sum);
		}
		
	}

}
