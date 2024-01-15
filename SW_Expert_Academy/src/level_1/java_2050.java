package level_1;

import java.util.Scanner;

public class java_2050 {
	
	public static void main(String[] args) {
		
		String alpabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArray = str.split("");
		
		for (int i = 0; i <= strArray.length; i++) {
			String answer = strArray[i];
			System.out.print(alpabet.indexOf(answer)+ 1 + " ");
		}
		
	}

}
