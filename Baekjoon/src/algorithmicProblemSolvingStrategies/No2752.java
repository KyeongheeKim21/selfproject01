package algorithmicProblemSolvingStrategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No2752 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		String[] str = br.readLine().split(" ");
		arr[0] = Integer.parseInt(str[0]);
		arr[1] = Integer.parseInt(str[1]);
		arr[2] = Integer.parseInt(str[2]);
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}
}