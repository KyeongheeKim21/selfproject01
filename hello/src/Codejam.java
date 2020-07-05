import java.util.Scanner;
import java.util.Vector;

public class Codejam {
	
	private String s;
	private char[] arr;
	private Vector<Integer> IO = new Vector<Integer>();
	private Vector<Integer> Io = new Vector<Integer>();
	private Vector<Integer> iO = new Vector<Integer>();
	private Vector<Integer> io = new Vector<Integer>();
	private boolean[] b ;//= new boolean[arr.length];
	private int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		scan.nextLine();
		Codejam[] example = new Codejam[test];
		
		for(int i = 0;i < test; i++) {
			Codejam t = new Codejam();
			t.s = scan.nextLine();
			example[i] = t;
		}
		for(int i = 0; i < test;i++) {
			example[i].solve(i);//System.out.println("case# :"+i);
		}
		
	}
	
	private void solve(int caseNum) {
		arr = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		b = new boolean[arr.length];
		for(int i=0;i<b.length;i++) {
			b[i] = true;
		}
		
		divid();
		System.out.println("case #"+(caseNum+1)+": "+count);
	}
	
	private void divid() {
		
		for(int i = 0 ;i < arr.length ;i++) {
			if(arr[i] == 'O') {
				for(int j = 0; j < i ; j++) {
					if(b[j] == true){
						if(arr[j] == 'I') {
							if(IO.isEmpty() == true || IO.lastElement() < j) { 
								IO.add(j);
								IO.add(i);
								b[j] = false;
								b[i] = false;
								count++;
								break;
							}
							else continue;
						}
					}
				}
				for(int j = 0; j < i ; j++) {
					if(b[j] == true){
						if(arr[j] == 'i') {
							if(iO.isEmpty() == true || iO.lastElement() < j) { 
								iO.add(j);
								iO.add(i);
								b[j] = false;
								b[i] = false;
								break;
							}
							else continue;
						}
					}
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			if( arr[i] == 'o') {
				for(int j = 0; j< i; j++) {
					if(b[j] == true){
						if(arr[j] == 'I') {
							if(Io.isEmpty() == true || Io.lastElement() < j) { 
								Io.add(j);
								Io.add(i);
								b[j] = false;
								b[i] = false;
								break;
							}
							else continue;
						}
						else { //if(arr[j] == 'i') {
							if(io.isEmpty() == true || io.lastElement() < j) { 
								io.add(j);
								io.add(i);
								b[j] = false;
								b[i] = false;
								break;
							}
							else continue;
						}
					}
				}
			}
		}
	}//divid()

}
