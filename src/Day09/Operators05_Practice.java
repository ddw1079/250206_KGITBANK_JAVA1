package Day09;

import java.util.Scanner;

// Q1) 다음 코드의 연산 결과를 예상해보세요
// byte num1 = 78, num2 = 37, num3 = 18;
// byte num4 = 4 num5 = 106;
// 
// num1 | num3
// num5 & num2
// num4 ^ num3
// ~num4
// num4 << 3
// num3 >> 1
// 

// ---- Q1 해설 ----
// 0100 1110 = num1 = 78
// |
// 0001 0010 = num3 = 18
// --------------
// 0101 1110 = 94
// 

// 0110 1010 = num5 = 106
// &
// 0010 0101 = num2 = 37
// --------------
// 0010 0000 = 32

// 0000 0100 = num4 = 4
// ^
// 0001 0010 = num3 = 18
// --------------
// 0001 0110 = 22

// ~
// 0000 0100 = num4 = 4
// --------------
// 1111 1011 = 252

// 0000 0100 = num4 = 4
// <<
// 3
// --------------
// 0010 0000 = 32

// 0001 0010 = num3 = 18
// >>
// 1
// --------------
// 0000 1001 = 9

public class Operators05_Practice {
    public static void main(String[] args) {
        byte num1 = 78, num2 = 37, num3 = 18, num4 = 4, num5 = 106;
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(num2));
        System.out.println(Integer.toBinaryString(num3));
        System.out.println(Integer.toBinaryString(num4));
        System.out.println(Integer.toBinaryString(num5));
        System.out.println("num1 | num3: " + (num1 | num3));
        System.out.println("num5 & num2: " + (num5 & num2));
        System.out.println("num4 ^ num3: " + (num4 ^ num3));
        System.out.println("~num4: " + (~num4));
        System.out.println("num4 << 3: " + (num4 << 3));
        System.out.println("num3 >> 1: " + (num3 >> 1));
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        System.out.println(Integer.toBinaryString(sc.nextInt()));
        sc.close();
    }
}
