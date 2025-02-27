package Day12;

import java.util.Scanner;

// ---- switch ~ case ----
// switch ~ case 의 원형:
//  switch (비교할 값) {
//      case 해당하는 값: // <-- 비교할 값이 해당하는 값일때 종속 실행
//          종속 문장;
//          break;       // <-- switch 구문 탈출.
//      default:         // <-- 비교할 값이 해당하는 값에 없을때 종속 실행
//          종속 문장;
//          break;
//  }
// 
// - break는 선택적으로 사용 가능. 
//   다른 case의 종속 코드까지 실행하고자 한다면 의도적으로 삭제하여도 무방함.
// 
// - switch ~ case 에는 실수 및 boolean(true|false) 값을 넣지 못함. 
//   각 case에 작성되는 값은 반드시 상수로 작성해주어야 한다.
// 
// - if ~ else 가 else if 조건을 모두 확인하는 반면, switch ~ case 는 비교 값만 확인하여 넘어가기 때문에
//   코드 실행 속도가 확연히 빨라짐.
// 
// 

public class Conditional02 {
    public static final int thisIsConstance = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter: ");
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("num 은 1입니다.");
            case 2:
                System.out.println("num 은 2입니다.");

            case 3:
                System.out.println("num 은 3입니다.");

            default:
                System.out.println("1~3 중 하나를 입력해주세요.");
                break;
        }

        System.out.print("Enter: ");
        num = sc.nextInt();

        switch (num) {
            case thisIsConstance:
                System.out.print(4);
            case 3:
                System.out.print(3);
            case 2:
                System.out.print(2);
            case 1:
                System.out.print(1);
            default:
                System.out.print("Launch!");

        }
        // boolean b = true;
        // switch (b) {     // <-- Only convertible int values, strings or enum variables are permitted
        //     case true:
                
        //         break;
        // }
        sc.close();
    }
}
