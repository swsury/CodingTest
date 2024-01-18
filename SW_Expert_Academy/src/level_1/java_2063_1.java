package level_1;

import java.util.*;

public class java_2063_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str_num = sc.next();
		int num = Integer.parseInt(str_num);
		
		String str = sc.nextLine();
		String[] str_arr = str.split(" ");
		
		int[] arr = new int[str_arr.length];
		
		for (int i = 0; i < str_arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		
		Arrays.sort(arr);
		
		int n = arr.length / 2;
		
		System.out.println(arr[n]);
	}

}
