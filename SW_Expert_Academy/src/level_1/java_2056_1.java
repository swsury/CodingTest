package level_1;

import java.util.Scanner;

public class java_2056_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String date = sc.next();
		
		int year = Integer.parseInt(date.substring(0,4));
		int month = Integer.parseInt(date.substring(4,6));
		int day = Integer.parseInt(date.substring(6));
		
		String answer = date.substring(0,4) + "/" + date.substring(4,6) + "/" + date.substring(6) ;
		
		if ( month > 0 && month < 13 ) {
			if ( month == 2 ) {
				if ( day > 0 && day < 29 ) {
					System.out.println(answer);
				}
				else {
					System.out.println("-1");
				}
			}
			
			else if ( month == 1 || month == 3  || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if ( day > 0 && day < 32 ) {
					System.out.println(answer);
				}
				else {
					System.out.println("-1");
				}
			}
			else {
				if ( day > 0 && day < 31 ) {
					System.out.println(answer);
				}
				else {
					System.out.println("-1");
				}
			}
			
		}
		else {
			System.out.println(-1);
		}
		
		
		
	}

}
