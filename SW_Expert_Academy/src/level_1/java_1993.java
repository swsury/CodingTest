package level_1;

import java.util.Scanner;

public class java_1993 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int one = 1;
				
		System.out.println(one);
		
		for ( int i = 2 ; i <= num; i++) {
			
			while ( num % i == 0) {
				System.out.println(i);
				num /= i;
			
			}
		}
		
		System.out.println(n);
	}

}
