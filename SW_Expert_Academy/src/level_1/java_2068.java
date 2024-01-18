package level_1;

import java.util.*;


public class java_2068 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i <= T; i++) {
			
			String str = sc.nextLine();
			String[] strArray = str.split(" ");
            
            int max = -2147000000;
			
			for (int j = 0; j < strArray.length-1; j++) {
				int num = Integer.parseInt(strArray[j]);
				if (num > max) {
					max = num;
				}
			}
			
			if ( max > 0 ) {
				System.out.println("#"+i+" "+max);
			}
		}
	}
}
