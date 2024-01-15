package level_1;

import java.util.Scanner;

public class java_2047 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//대문자->소문자 : toLowerCase();
		String answer = str.toUpperCase();
			
		System.out.println(answer);
	}

}
