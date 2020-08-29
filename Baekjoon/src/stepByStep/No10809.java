package stepByStep;
import java.util.Scanner;

public class No10809 {
	
	static int[] table = new int[26];
	
	public static void work(String s) {
		for(int i = 0; i < s.length();i++) {
			switch(s.charAt(i)) {
			case 'a': 
				if(table[0] == -1)
					table[0] = i; 
				break;
			case 'b': 
				if(table[1] == -1)
					table[1] = i; 
				break;
			case 'c': 
				if(table[2] == -1)
					table[2] = i; 
				break;
			case 'd': 
				if(table[3] == -1)
					table[3] = i; 
				break;
			case 'e': 
				if(table[4] == -1)
					table[4] = i; 
				break;
			case 'f': 
				if(table[5] == -1)
					table[5] = i; 
				break;
			case 'g': 
				if(table[6] == -1)
					table[6] = i; 
				break;
			case 'h': 
				if(table[7] == -1)
					table[7] = i; 
				break;
			case 'i': 
				if(table[8] == -1)
					table[8] = i; 
				break;
			case 'j': 
				if(table[9] == -1)
					table[9] = i; 
				break;
			case 'k': 
				if(table[10] == -1)
					table[10] = i; 
				break;
			case 'l': 
				if(table[11] == -1)
					table[11] = i; 
				break;
			case 'm': 
				if(table[12] == -1)
					table[12] = i; 
				break;
			case 'n': 
				if(table[13] == -1)
					table[13] = i; 
				break;
			case 'o': 
				if(table[14] == -1)
					table[14] = i; 
				break;
			case 'p': 
				if(table[15] == -1)
					table[15] = i; 
				break;
			case 'q': 
				if(table[16] == -1)
					table[16] = i; 
				break;
			case 'r': 
				if(table[17] == -1)
					table[17] = i; 
				break;
			case 's': 
				if(table[18] == -1)
					table[18] = i; 
				break;
			case 't': 
				if(table[19] == -1)
					table[19] = i; 
				break;
			case 'u': 
				if(table[20] == -1)
					table[20] = i; 
				break;
			case 'v': 
				if(table[21] == -1)
					table[21] = i; 
				break;
			case 'w': 
				if(table[22] == -1)
					table[22] = i; 
				break;
			case 'x': 
				if(table[23] == -1)
					table[23] = i; 
				break;
			case 'y': 
				if(table[24] == -1)
					table[24] = i; 
				break;
			case 'z': 
				if(table[25] == -1)
					table[25] = i; 
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		scan.close();
		for(int i =0; i< table.length ;i++) {
			table[i] = -1;
		}
		
		work(s);
		for(int i=0; i< table.length ;i++) {
			System.out.print(table[i]+" ");
		}
		
	}

}
