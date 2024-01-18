package level_1;

import java.util.*;

public class java_2063_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();        
        sc.nextLine(); // Consume the newline character
        
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
