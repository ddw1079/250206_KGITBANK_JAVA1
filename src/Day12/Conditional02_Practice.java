package Day12;

// Q1) 숫자 하나 입력받고 14보다 크고작음을 switch ~ case 조건문을 사용하여 출력하라.

// Q2) 숫자 하나 입력받고 3의 배수인지 여부를 switch ~ case 조건문을 사용하여 출력하라.

import java.util.Scanner;

public class Conditional02_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("14보다 크거나 같은지 체크하려면 입력: ");
        num = sc.nextInt();
        System.out.print("출력: ");

        // switch (num >= 14 ? 0 : 1) {
        //     case 0:
        //         System.out.println("14보다 작은 수");
        //         break;
        //     default:
        //         System.out.println("14보다 크거나 같은 수");
        //         break;
        // }

        switch (num / Math.abs(num)) { // <-- 삼항연산자 안쓴 버전. 부호부터 확인한다.
            case -1:
                System.out.println("14보다 작은 수");

                break;
            case 1:
                switch (num / 14) {
                    case 0:
                        System.out.println("14보다 작은 수");

                        break;

                    default:
                        System.out.println("14보다 크거나 같은 수");

                        break;
                }
                break;
            default:
                break;
        }

        System.out.print("3의 배수인지 체크하려면 입력: ");
        num = sc.nextInt();
        System.out.print("출력: ");

        switch (num % 3) {
            case 0:
                System.out.println("3의 배수");
                break;

            default:
                System.out.println("3의 배수는 아니다.");

                break;
        }

        sc.close();
    }
}
