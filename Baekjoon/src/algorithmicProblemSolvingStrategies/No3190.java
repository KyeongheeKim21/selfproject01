package algorithmicProblemSolvingStrategies;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No3190 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] map = new int[N][N];
		int apple = scan.nextInt();
		Queue<int[]> snake = new LinkedList<>();
		int direction = 0;
		int[] start = {0,0};
		snake.add(start);
		for(int a = 0; a < apple; a++) {
			map[scan.nextInt()-1][scan.nextInt()-1] = 1;
		}
		int turn = scan.nextInt();
		ArrayList<tp> turningPoint = new ArrayList<>();
		while(turn > 0) {
			tp temp = new tp(scan.nextInt(),scan.nextLine().charAt(1));
			turningPoint.add(temp);
			turn--;
		}
		scan.close();
		
		int time = 0;
		
		int[] before = new int[2];
		before[0] = start[0];
		before[1] = start[1];
		
		L: while(before[0] < N && before[1] < N) {
			time++;
			int[] now = new int[2];
			now[0] = before[0];
			now[1] = before[1];
			
			switch(direction) {
			case 0://right
				now[1]++;
				break;
			case 1://down
				now[0]++;
				break;
			case 2://left
				now[1]--;
				break;
			case 3://up
				now[0]--;
				break;
			}
			 
			if(now[0] >= N || now[1] >= N || now[0] < 0 || now[1] < 0) {
				break;
			}
			else{
				
				for(int[] x: snake) {
					if ( x[0] == now[0] && x[1] == now[1]) break L;
				}
				
				snake.add(now);
				if(map[now[0]][now[1]] != 1) {//(now[0] >= 0 && now[1] >= 0) && 
					snake.poll();
				}
				else map[now[0]][now[1]] = 0;
				if(!turningPoint.isEmpty() && turningPoint.get(0).x == time) {
					if('D' == turningPoint.get(0).c) {
						direction = (direction+1) % 4;
						turningPoint.remove(0);
					}
					else if('L' == turningPoint.get(0).c) {
						direction = (direction+3) % 4;
						turningPoint.remove(0);
					}
				}
			}
			before[0] = now[0];
			before[1] = now[1];
		}
		System.out.println(time);
	}
}
class tp {
	int x;
	char c;
	tp(int xx, char cc){
		this.x =xx;
		this.c = cc;
	}
}