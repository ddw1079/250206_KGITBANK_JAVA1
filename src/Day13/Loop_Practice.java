package Day13;

import java.util.Scanner;

// Q1) 별도의 입력 없이 알파벳 A ~ Z 까지 출력되는 프로그램 작성.
// Q2) 소문자 알파벳 하나를 입력 받고, a부터 입력 받은 알파벳까지 출력하는 프로그램 작성
//      입력: c 
//      출력: a b c
// Q3) 숫자 한개를 입력받고 그 숫자를 출력하는 것을 반복하다 숫자 9가 입력되었을 때 종료되는 프로그램 작성

public class Loop_Practice {
    public static void main(String[] args) {
        System.out.print("A~Z 출력: ");
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.printf("%c ", i);
        }

        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나 입력: ");
        char charInput = sc.next().charAt(0);

        System.out.print("출력: ");
        if ('a' <= charInput) {
            for (char i = 'a'; i <= charInput; i++) {
                if ('z' < i) {
                    break;
                }
                System.out.printf("%c ", i);
            }
        }

        System.out.println();

        for (int j = 0;j != 9;) {
            System.out.print("숫자 입력: ");
            j = sc.nextInt();
            if (j==9) {
                continue;
                // break;
            }
            System.out.print("출력: " + j + "\n\n");

        }
        System.out.print("9가 입력되어 종료합니다.");
        sc.close();
    }
}
