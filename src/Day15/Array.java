package Day15;

import java.util.Scanner;

// ---- Array ----
// Q1) 정수 10개를 연속으로 입력받고 그대로 출력하는 프로그램 작성
//  eg.) 입력: 3 8 1 2 5 8 9 0 2 7 
//       출력: 3 8 1 2 5 8 9 0 2 7 
//  10개를 작성해도 이렇게 길어지는데 작성해야 하는 변수가 100개, 1,000개 라면? 이를 변수 하나씩 할당하여 작성하는 것은 무리가 있다.
//  이를 일괄적으로 관리하기 위하여 생각해낸 개념이 Array 이다.
// 

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
        System.out.print("입력: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        n6 = sc.nextInt();
        n7 = sc.nextInt();
        n8 = sc.nextInt();
        n9 = sc.nextInt();
        n10 = sc.nextInt();
        System.out.printf("출력: %d %d %d %d %d %d %d %d %d %d %d ", n1,n2,n3,n4,n5,n6,n7,n8,n9,n10);
        // ---- 이렇게 작성하는 것은 낭비라고 생각이 됨. 그래서 생각해낸 개념이.. Array 이다.


        // // 
        // int scInt = 1;
        // String result = "";

        // System.out.print("입력: ");
        // for (int i = 0; i < 10; i++) {
        //     scInt = sc.nextInt();
        //     result += "" + scInt + " ";
        // }

        // System.out.println("출력: " + result);
    }
}
