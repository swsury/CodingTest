package level_1;

import java.util.Scanner;

public class java_2072 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <=T; i++) {
			
			String str = sc.nextLine();
	        String[] str_arr = str.split(" ");
	        
	        int num = 0;
	        
	        for (int j = 0; j < str_arr.length; j++ ) {
	        	int n = Integer.parseInt(str_arr[j]);
	        	if ( n % 2 == 1) {
	        		int x = n;
	        		num += x;
	        	
	        	}
	        	
	        }
	        int answer = num / 1;
	        
	        System.out.println("#"+i+" "+answer);
	        
		}
	}

}
