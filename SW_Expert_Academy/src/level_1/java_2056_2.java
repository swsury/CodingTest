package level_1;

import java.util.Scanner;

public class java_2056_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			String date = sc.next();
			
			int year = Integer.parseInt(date.substring(0,4));
			int month = Integer.parseInt(date.substring(4,6));
			int day = Integer.parseInt(date.substring(6));
			
			String answer = "#"+i+" "+date.substring(0,4) + "/" + date.substring(4,6) + "/" + date.substring(6) ;
			String wrong = "#"+i+" -1";
			
			if ( month > 0 && month < 13 ) {
				if ( month == 2 ) {
					if ( day > 0 && day < 29 ) {
						System.out.println(answer);
					}
					else {
						System.out.println(wrong);
					}
				}
				
				else if ( month == 1 || month == 3  || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if ( day > 0 && day < 32 ) {
						System.out.println(answer);
					}
					else {
						System.out.println(wrong);
					}
				}
				else {
					if ( day > 0 && day < 31 ) {
						System.out.println(answer);
					}
					else {
						System.out.println(wrong);
					}
				}
				
			}
			else {
				System.out.println(wrong);
			}
		}
		
		
		
	}

}
