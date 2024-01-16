package level_1;

import java.util.Scanner;

public class java_2058 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		int answer = 0;
		
		for ( int i = 0; i < num.length(); i++) {
			answer += Integer.parseInt(num.substring(i,i+1));
		}
		
		System.out.println(answer);
	}

}
