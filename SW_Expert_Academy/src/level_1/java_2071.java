package level_1;

import java.util.Scanner;

public class java_2071 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <=T; i++) {
			
			String str = sc.nextLine();
	        String[] str_arr = str.split(" ");
	        
	        float num = 0;
	        
	        for (int j = 0; j < str_arr.length; j++ ) {
	        	num += Integer.parseInt(str_arr[j]);	        	
	        }
	        float answer = num / str_arr.length;
	        
	        System.out.println("#"+i+" "+Math.round(answer));
		}
	}

}
