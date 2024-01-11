package level_1;

import java.util.Scanner;

public class java_2019 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1;
		
		for (int i=0; i <= num; i++) {
			System.out.print(n + " ");
			n *= 2;
		}
	}

}
