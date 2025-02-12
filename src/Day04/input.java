package Day04;

import java.util.Scanner;

// ---- 입력 ----
// Scanner 클래스를 통해서 입력을 받을 수 있다.
// 이때, 반드시 java.util.Scanner 를 import 해주어야 한다.
// Scanner 사용 원형: Scanner 변수이름 = nwe Scanner(System.in);
//                   변수이름.nextInt(); 사용자가 입력한 정수 한 개를 읽어옴.
// 
// 
// 
// 


public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("입력: ");
        num = sc.nextInt();
        System.out.println("출력: " + num);
    }
}
