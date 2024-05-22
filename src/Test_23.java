

import java.util.Arrays;
import java.util.Scanner;

public class Test_23 {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		
		for(int i = 1; i<=T; i++) {
			
			int N = sc.nextInt();
			
			int arr[] = new int[N];
			
			for(int k =0; k<N; k++) {
				arr[k] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			
			System.out.print("#"+i+" ");

			for (int j = 0; j < N; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			
			
		}
		
		
	}

}
