package level_1;

import java.util.*;

public class java_1993 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++ ) {
			if ( num%i != 0) continue;
			System.out.format("%d ", i);
		}
		
		
	}

}
