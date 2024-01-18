package level_1;

import java.util.Scanner;

public class java_2070 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if ( n1-n2 > 0 ) {
				System.out.println("#"+i+" >");
			}
			else if ( n1-n2 == 0) {
				System.out.println("#"+i+" =");
			}
			else {
				System.out.println("#"+i+" <");
			}
		}
	}

}
