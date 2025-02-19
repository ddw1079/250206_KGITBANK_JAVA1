package Day07;

// Q1) 다음 코드의 연산 결과를 예상해보세요.
// int num1 = 10, num2 = 20, num3 = 4, num4 = 13, num5 = 4;
    
// num1 == num2;
// num4 != num1;
// num4 > num2;
// num5 >= num3;
// num1 < num4;
// num3 <= num1;

// ---- Q1 해설
// num1 == num2;
//      10 == 20 ? false
// num4 != num1;
//      13 != 10 ? true
// num4 > num2;
//      13 > 20 ? false 
// num5 >= num3;
//      4 >= 4 ? true
// num1 < num4;
//      10 < 13 ? true
// num3 <= num1;
//      4 <= 10 ? true

public class Operators02_Practice02 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 4, num4 = 13, num5 = 4;
        // boolean result;
    
        // result = num1 == num2;
        // System.out.println("num1 == num2 : " + result);

        // result = num4 != num1;
        // System.out.println("num4 != num1 : " + result);

        // result = num4 > num2;
        // System.out.println("num4 > num2 : " + result);

        // result = num5 >= num3;
        // System.out.println("num5 >= num3 : " + result);

        // result = num1 < num4;
        // System.out.println("num1 < num4 : " + result);

        // result = num3 <= num1;
        // System.out.println("num3 <= num1 : " + result);

        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num4 != num1 : " + (num4 != num1));
        System.out.println("num4 > num2 : " + (num4 > num2));
        System.out.println("num5 >= num3 : " + (num5 >= num3));
        System.out.println("num1 < num4 : " + (num1 < num4));
        System.out.println("num3 <= num1 : " + (num3 <= num1));

    }
}

  
