package Day06;

// // Q1) 다음 변수에 저장된 값을 예상해보세요.
// int num1, num2, num3;
// num1 = 9 + 8 / 2 * 4; 
//      = 9 + 4 * 4 
//      = 9 + 16 
//      = 25
// 
// num2 = 8 - 12 * (2 + 2) / 8 % 2;
//      = 8 - 12 * 4 / 8 % 2
//      = 8 - 48 / 8 % 2
//      = 8 - 6 % 2
//      = 8 - 0
//      = 8
// 
// num3 = 1 % 3 * (1 + 3) * (12 / 6) % 10;
//      = 1 % 3 * 4 * 2 % 10 <-- 1 을 3으로 나눈 나머지는 1임.
//      = 1 * 4 * 2 % 10
//      = 4 * 2 % 10
//      = 8 % 10
//      = 8


public class Operations_Practice {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 9 + 8 / 2 * 4;
        num2 = 8 - 12 * (2 + 2) / 8 % 2;
        num3 = 1 % 3 * (1 + 3) * (12 / 6) % 10;
        
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("num3 : " + num3);
    }
}
