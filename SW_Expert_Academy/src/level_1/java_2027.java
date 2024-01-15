package level_1;

public class java_2027 {
	
	public static void main(String[] args) {
		
		int num = 5;
		
		for (int n = 0; n < num ; n++ ) {
			for (int i = 0; i < num ; i++ ) {
				if ( i == n ) {
					System.out.print("#");
				}
				else {
					System.out.print("+");
				}
			}
			System.out.println("");
		}
	}
}
