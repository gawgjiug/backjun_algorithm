

import java.util.Scanner;

public class Test_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<N.length(); i++) {
			
			sum += N.charAt(i) - '0';
						
		}
		
		System.out.println(sum);


	
			

		
		
		
	}

}
