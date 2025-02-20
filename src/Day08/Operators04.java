package Day08;

// ---- 비트 ---- 
// 컴퓨터의 가장 작은 단위 bit.
//  - 1bit 에는 2진수 숫자 하나를 저장할 수 있다.
// 프로그래밍에서 사용하는 기본 단위 byte.
//  - 1byte에는 8개의 bit가 들어간다. 1byte == 8bit
// 
// Q1) 다음 2진수를 10진수로 변환해보세요.
// 0000 0011 | 00001011 | 00011000
// 

// ---- 2진수 쉽게 계산하는법 ----
// 해당 숫자에서 가장 가까운 2의 제곱수를 찾아서 2진수의 자릿수를 올리고 해당 숫자에서 뺀다.
// 이 과정을 0이 될때까지 반복한다.
// 예를 들어... 215
// 1. 215 에서 가까운 2의 제곱수: 128   | 215 - 128 = 87    -> 1000 0000
// 2. 87 에서 가까운 2의 제곱수: 64     | 87 - 64 = 23      -> 1010 0000
// 3. 23 에서 가까운 2의 제곱수: 16     | 23 - 16 = 7       -> 1010 1000
// 4. 7 에서 가까운 2의 제곱수: 4       | 7 - 4 = 3         -> 1010 1100
// 5. 3 에서 가까운 2의 제곱수: 2       | 3 - 2 = 1         -> 1010 1110
// 6. 1 에서 가까운 2의 제곱수: 1       | 1 - 1 = 0         -> 1010 1111
// => 215 = 1010 1111
// 

// ---- 10진수를 8진수, 16진수로 쉽게 계산하는법 ----
// 2진수 3자리의 범위는 8진수 1자리의 범위와 같다. (2진수 000(0) ~ 111(7) === 8진수 0(0) ~ 7(7))
// 2진수 4자리의 범위는 16진수 1자리의 범위와 같다. (2진수 0000(0) ~ 1111(15) === 16진수 0(0) ~ F(15))
//  => 따라서 - 10진수를 2진수로 변환한 뒤 각 자리를 8진수는 3자리, 16진수는 4자리씩 끊어서 계산하면 됨
// 예를 들어... 36
// 36은 2진수 0011 1110 로 치환할 수 있다. 
// 0011 1110 의 8진수는 3자리씩 끊어서 (000 111 110 으로) 계산하여 각 자리를 10진수로 치환하면 됨: 076
// 0011 1110 의 16진수는 4자리씩 끊어서 (0011 1110 으로) 계산하여 각 자리를 16진수로 치환하면 됨: 3E
// 

// Q2) 해당 10진수들을 각각의 진수로 표현해보세요
//  값  |   2진수   |    8진수   |  16진수   |
// ------------------------------
//  10  | 0000 1010 |    012    |   0xA     | 
//  35  | 0010 0011 |    043    |   0x23    |
//  46  | 0010 1110 |    056    |   0x2E    | 
//  31  | 0001 1111 |    037    |   0x1F    |
//  62  | 0011 1110 |    036    |   0x3E    |
//  255 | 1111 1111 |    0377   |   0xFF    |
// 



public class Operators04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 35;
        int num3 = 46;
        int num4 = 31;
        int num5 = 62;
        int num6 = 255;

        System.out.print("값\t|2진수\t\t|8진수\t|16진수\t\n");
        System.out.println(num1 + "\t|" + Integer.toBinaryString(num1) + "\t\t|" + Integer.toOctalString(num1) + "\t|" + Integer.toHexString(num1) + "\t");
        System.out.println(num2 + "\t|" + Integer.toBinaryString(num2) + "\t\t|" + Integer.toOctalString(num2) + "\t|" + Integer.toHexString(num2) + "\t");
        System.out.println(num3 + "\t|" + Integer.toBinaryString(num3) + "\t\t|" + Integer.toOctalString(num3) + "\t|" + Integer.toHexString(num3) + "\t");
        System.out.println(num4 + "\t|" + Integer.toBinaryString(num4) + "\t\t|" + Integer.toOctalString(num4) + "\t|" + Integer.toHexString(num4) + "\t");
        System.out.println(num5 + "\t|" + Integer.toBinaryString(num5) + "\t\t|" + Integer.toOctalString(num5) + "\t|" + Integer.toHexString(num5) + "\t");
        System.out.println(num6 + "\t|" + Integer.toBinaryString(num6) + "\t|" + Integer.toOctalString(num6) + "\t|" + Integer.toHexString(num6) + "\t");
    }
}
