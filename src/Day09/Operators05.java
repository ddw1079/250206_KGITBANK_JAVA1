package Day09;

// ---- 비트 연산자 ----
// 10진수가 아닌 2진수의 각 비트별로 연산을 진행
// &(비트 AND 연산): 대응되는 비트가 모두 1이면 1을 반환
// |(비트 OR 연산): 대응되는 비트가 하나라도 1이면 1을 반환
// ^(비트 XOR 연산): 대응되는 비트가 서로 다르면 1을 반환
// ~(비트 NOT 연산): 비트를 반전시킨다. 0이면 1을, 1이면 0을 반환
// <<(비트 Left Shift 연산): 비트를 모두 지정 수 만큼 왼쪽으로 이동.
// >>(비트 Right Shift 연산): 비트를 모두 지정 수 만큼 오른쪽으로 이동.
// 


// -- & 연산 예시 --
// 0101 0011 = 83
// &
// 0100 0111 = 71
// --------------
// 0100 0011 = 67
// 

// -- | 연산 예시 --
// 0101 0011 = 83
// |
// 0100 0111 = 71
// --------------
// 0101 0111 = 87
// 

// -- ^ 연산 예시 --
// 0101 0011 = 83
// ^
// 0100 0111 = 71
// --------------
// 0001 0100 = 20
// 

// -- ~ 연산 예시 --
// 0101 0011 = 83
// ~
// --------------
// 1010 1100 = ?
// 

// -- << 연산 예시 --
// 0101 0011 = 83
// <<
// 3
// --------------
// 0010 1001 1000 = 664
// 

// -- >> 연산 예시 --
// 0101 0011 = 83
// >>
// 3
// --------------
// 0000 1010 = 10
// 
public class Operators05 {
    public static void main(String[] args) {
        int num1 = 83;
        int num2 = 71;
        int operand = 3;
        // & 연산
        System.out.println(Integer.toBinaryString(num1) + " = " + num1);
        System.out.println("&");
        System.out.println(Integer.toBinaryString(num2) + " = " + num2);
        System.out.println("--------------");
        System.out.println(Integer.toBinaryString(num1 & num2) + " = " + (num1 & num2));
        System.out.println();

        // | 연산
        System.out.println(Integer.toBinaryString(num1) + " = " + num1);
        System.out.println("|");
        System.out.println(Integer.toBinaryString(num2) + " = " + num2);
        System.out.println("--------------");
        System.out.println(Integer.toBinaryString(num1 | num2) + " = " + (num1 | num2));
        System.out.println();

        // ^ 연산
        System.out.println(Integer.toBinaryString(num1) + " = " + num1);
        System.out.println("^");
        System.out.println(Integer.toBinaryString(num2) + " = " + num2);
        System.out.println("--------------");
        System.out.println(Integer.toBinaryString(num1 ^ num2) + " = " + (num1 ^ num2));
        System.out.println();

        // ~ 연산
        System.out.println("~");
        System.out.println(Integer.toBinaryString(num1) + " = " + num1);
        System.out.println("--------------");
        System.out.println(Integer.toBinaryString(~num1) + " = " + (~num1));
        System.out.println();

        // << 연산
        System.out.println(Integer.toBinaryString(num1) + " = " + num1);
        System.out.println("<<");
        System.out.println(operand);
        System.out.println("--------------");
        System.out.println(Integer.toBinaryString(num1 << operand) + " = " + (num1 << operand));
        System.out.println();
        
        // >> 연산
        System.out.println(Integer.toBinaryString(num1) + " = " + num1);
        System.out.println(">>");
        System.out.println(operand);
        System.out.println("--------------");
        System.out.println(Integer.toBinaryString(num1 >> operand) + " = " + (num1 >> operand));
        System.out.println();
    }
}
