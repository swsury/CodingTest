package level_2;

import java.util.*;

public class java_1204 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int num = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            sc.nextLine();

            String str = sc.nextLine();
            String[] str_arr = str.split(" ");
            
            // 0부터 100까지 점수 (빈도 표시 배열)
            int counts[] = new int[101];

            // 학생의 점수 배열에서 반복문을 실행하여 빈도를 추가한다. 이때 counts의 index값이 점수가 된다.
            for (int j = 0; j < str_arr.length; j++) {
                int n = Integer.parseInt(str_arr[j]);
                counts[n] += 1;
            }
            

            // 가장 높은 빈도를 나타내기 위한 반복문
            int max = 0;
            int maxIndex = 0;

            for (int j = 0; j < counts.length - 1; j++) {
            	
                if (counts[j] >= max && j > maxIndex) {
                	max = counts[j];
                	maxIndex = j;

                }
            }
            
            System.out.println("#"+i+" "+maxIndex);

        }
    }
}
