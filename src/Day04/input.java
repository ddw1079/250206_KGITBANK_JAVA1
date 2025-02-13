package Day04;

import java.util.Scanner;

// ---- 입력 ----
// Scanner 클래스를 통해서 입력을 받을 수 있다.
// 이때, 반드시 java.util.Scanner 를 import 해주어야 한다.
// Scanner 사용 원형: Scanner 변수이름 = nwe Scanner(System.in);
//                   변수이름.nextInt(); 사용자가 입력한 정수 한 개를 읽어옴.
//                   변수이름.nextDouble(); 사용자가 입력한 실수 한 개를 읽어옴.
//                   변수이름.next(); 사용자가 입력한 문자열을 읽어옴.
//                   변수이름.next().charAt([INDEX]); 사용자가 입력한 문자열 중 INDEX 번째의 문자를 읽어옴.
//                   변수이름.nextLine(); 엔터 전까지 공백을 포함한 문자열을 읽어온다.
// Scanner 사용 완료 후에는 변수이름.close() 를 사용하여 호출을 끝내주어야 한다.

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 입력
        System.out.print("정수 입력: ");
        int num;
        num = sc.nextInt();
        System.out.println("정수 출력: " + num);

        // 실수 입력
        System.out.print("실수 입력: ");
        double fnum;
        fnum = sc.nextDouble();
        System.out.println("실수 출력: " + fnum);

        // 문자 입력        
        System.out.print("문자 입력: ");
        char ch;
        ch = sc.next().charAt(0);
        System.out.println("문자 출력: " + ch);

        System.out.printf(
            "%c",
            70
        );

        // 문자열 입력
        String str = sc.nextLine();
        System.out.println("str: "+str);
        
        sc.close();
        str = sc.nextLine();

        // 두 수 입력
        int num1, num2;
        System.out.print("두 수 입력: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("두 수 출력: ");
        System.out.println("num1: " + num1 + " | num2: " + num2);
    }
}
