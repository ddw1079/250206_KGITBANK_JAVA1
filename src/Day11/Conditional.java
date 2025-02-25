package Day11;

import java.util.Scanner;

// ---- 조건문 ----
// 조건식을 비교하고 해당 조건식이 참이면 종속 문장을 실행, 거짓이면 탈출.
// 조건문으로는 if ~ else, switch ~ case 가 있음.
// 
// if ~ else 원형:
// if (조건식)          <-- 조건문의 시작
//      { 종속 문장; }
// else if (조건식)     <-- 조건문을 추가
//      { 종속 문장; }
// else                <-- 나머지
//      { 종속 문장; }
// if ~ else 문에서 조건식 뒤에 (;, 세미콜론) 
// 을 붙이면 실행되지 않음/ 
// 종속 문장이 한줄이면 중괄호를 생략해도 됨
// 

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter: ");
        num = sc.nextInt();

        if (num > 10) {
            System.out.println("num은 10보다 큽니다.");
        } 

        else if (num > 5) {
            System.out.println("num은 5보다 큽니다.");
        }

        else 
            System.out.println("num은 5보다 작거나 같습니다.");

        System.out.print("입력: ");
        num = sc.nextInt();

        if (num==5) {
            System.out.println("num은 5입니다");
        }
        
        sc.close();
    }
}
