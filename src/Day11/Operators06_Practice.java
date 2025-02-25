package Day11;

import java.util.Scanner;

// Q1) 숫자 하나 입력받고 14보다 크고작음을 삼항연산자를 사용하여 출력하라.

// Q2) 숫자 하나 입력받고 3의 배수인지 여부를 삼항연산자를 사용하여 출력하라.

public class Operators06_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("14보다 크거나 같은지 체크하려면 입력: ");
        num = sc.nextInt();
        System.out.println("출력: " + (num>=14?"14보다 크거나 같은 수":"14보다 작은 수"));

        System.out.print("3의 배수인지 체크하려면 입력: ");
        num = sc.nextInt();
        System.out.println("출력: " + (num%3==0?"3의 배수":"3의 배수는 아니다."));
        
        sc.close();
    }
}

