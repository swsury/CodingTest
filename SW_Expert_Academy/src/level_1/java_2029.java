package level_1;

import java.util.Scanner;

public class java_2029 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for ( int i = 1; i <= n ; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int x = n1 / n2;
			int y = n1 % n2;
			System.out.println("#"+i+" "+x+" "+y);
		}
		
	}

}
