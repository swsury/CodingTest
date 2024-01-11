package level_1;

import java.util.*;

public class java_1993 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int one = 1;
		int n = num;
		
		int i=2;
		ArrayList<Integer> list = new ArrayList<>();
		
		while(num>=i) 
		{
			if(num%i==0) 
			{
				list.add(i);
				num /= i;
			}
			else 
			{
				i++;
			}
		}
		
		HashSet<Integer> arr = new HashSet<Integer>(list);
		
		String resert = arr.toString().replaceAll(",", "");
		String answer = resert.replace("[", "").replace("]", "");
		
		int lastIdx = list.size() -1; 
		int lastNum = list.get(lastIdx);
		
		if (lastNum == n) {
			System.out.println(one +" "+ answer);
		}
		else {
			System.out.println(one +" "+ answer +" "+ n);
		}
		
		
	}

}
