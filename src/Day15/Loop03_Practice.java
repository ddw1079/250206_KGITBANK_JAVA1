package Day15;

import java.util.Scanner;

// Q3) 숫자 한개를 입력받고 그 숫자를 출력하는 것을 반복하다 짝수가 입력되었을 때 종료되는 프로그램을 while 문을 사용하여 작성
// if, break 를 사용하지 않고 작성해보자.

public class Loop03_Practice {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        
        Scanner sc = new Scanner(System.in);
        int j = 0;

        do {
            System.out.print("숫자 입력: ");
            j = sc.nextInt();

            System.out.print("출력: " + j + "\n\n");
        } while(j%2 != 0);
        System.out.print("짝수가 입력되어 종료합니다.");
        sc.close();

        System.out.println("Processing time: " + (System.currentTimeMillis() - t) + "ms");
    }
}
