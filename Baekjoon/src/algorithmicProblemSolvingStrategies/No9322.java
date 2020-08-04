package algorithmicProblemSolvingStrategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class No9322 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int TC = scan.nextInt();
		for(int i = 0; i < TC; i++) {
			int wc = scan.nextInt();//word count 
			scan.nextLine();
			String[] encoding1 = scan.nextLine().split(" ");
			String[] encoding2 = scan.nextLine().split(" ");
			String[] sentence = scan.nextLine().split(" ");
			HashMap<String,String> mapping = new HashMap<>();
			String ans = "";
			for(int j = 0; j < wc; j++) {
				mapping.put(encoding2[j],sentence[j]);
			}
			for(String s: encoding1) {
				ans += mapping.get(s) +" ";
			}
			System.out.println(ans);
		}
		scan.close();
	}

}
