package Day05;

import java.util.Scanner;

// ---- input 연습문제 ----
// Q1. 문자 두 개를 입력 받고 순서를 바꿔 출력해보세요.
// ex) 입력: A B
//     출력: B A

// Q2. 년 월 일을 입력 받고 출력할 때는 년, 월, 일을 붙여서 출력해보세요. 빈 자리는 0으로 채워야 합니다.
// ex) 입력: 2025 2 13
//     출력: 2025년 02월 13일

// Q3. 숫자를 입력 받아서 KGITBANK 글자를 출력해보세요.
// K 75
// G 71
// I 73
// T 84
// B 66
// A 65
// N 78
// K 75

public class input_Practice {
    public static void main(String[] args) {
        // 입력 기본 선언
        Scanner sc = new Scanner(System.in);

        // Q1 정답
        System.out.println("---- Q1 정답 ----");
        char A, B;
        System.out.print("두 글자 입력: ");
        A = sc.next().charAt(0);
        B = sc.next().charAt(0);
        System.out.print("두 글자 출력: " + B + " "+ A + "\n");

        // Q2 정답
        System.out.println("---- Q2 정답 ----");
        int year, month, day;
        System.out.print("년월일 입력: ");
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();
        System.out.printf("년월일 출력: %d년 %02d월 %02d일\n",year,month,day);
        
        // Q3 정답
        System.out.println("---- Q3 정답 ----");
        int[] input = new int[8]; 
        String result="";
        
        System.out.print("8개 숫자 입력: ");

        for(int i = 0 ; i < 8 ; i++) {
            input[i] = sc.nextInt();
            result += (char)input[i];
        }
        System.out.printf("출력: " + result);

        // 좀 더 단순한 버전
        System.out.println("---- Q3 정답 2 ----");
        int c1, c2, c3, c4, c5, c6, c7, c8;
        
        System.out.print("8개 숫자 입력: ");
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        c3 = sc.nextInt();
        c4 = sc.nextInt();
        c5 = sc.nextInt();
        c6 = sc.nextInt();
        c7 = sc.nextInt();
        c8 = sc.nextInt();
        System.out.printf("출력: %c%c%c%c%c%c%c%c",c1,c2,c3,c4,c5,c6,c7,c8);

        sc.close();
    }
}
