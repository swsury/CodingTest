package level_2;

import java.util.Scanner;

public class java_1284 {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int T = sc.nextInt();
		 
		 for (int i = 1; i <= T; i++) {
			 
			 sc.nextLine();
			 
			 int P = sc.nextInt();
			 int Q = sc.nextInt();
			 int R = sc.nextInt();
			 int S = sc.nextInt();
			 int W = sc.nextInt();
			 
			 int A = P * W;
			 
			 int B = 0;
			 
			 if ( W > R ) {
				 B = Q + (W - R) * S;
			 }
			 else {
				 B = Q;
			 }
			 

			 
			 if ( A > B ) {
				 System.out.println("#"+i+" "+ B);
			 }
			 else {
				 System.out.println("#"+i+" "+ A);
			 }
			 
		 }
		 

	}

}
