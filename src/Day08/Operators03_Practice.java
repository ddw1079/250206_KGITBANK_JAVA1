package Day08;

// Q1) 다음 코드의 연산 결과를 예상해보세요.
// int num1 = 10, num2 = 20, num3 = 4, num4 = 13, num5 = 4;
    
// num5 >= num3 || num1 == num2
// num4 != num1 && num1 < num4
// num4 > num2 && num3 == num5
// !(num1 > num4) || num3 <= num1

// ---- Q1 해설 ----
// num5 >= num3 || num1 == num2
//      -- 4 >= 4 || 10 == 20
//      -- true || false
//      -- true

// num4 != num1 && num1 < num4
//      -- 13 != 10 && 10 < 13
//      -- true && true 
//      -- true

// num4 > num2 && num3 == num5
//      -- 13 > 20 && 4 == 4
//      -- false && true
//      -- false

// !(num1 > num4) || num3 <= num1
//      -- !(10 > 13) || 4 <= 10
//      -- !(fasle) || 4 <= 10
//      -- true || true
//      -- true

// !(num1 > num4) || num3 <= num1
public class Operators03_Practice {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 4, num4 = 13, num5 = 4;
        System.out.printf("num1: %d num2: %d num3: %d num4: %d num5: %d\n", num1, num2, num3, num4, num5);
        System.out.println("num5 >= num3 || num1 == num2: " + (num5 >= ++num3 || ++num1 == ++num2));
        System.out.println("num4 != num1 && num1 < num4: " + (num4 != num1 && num1 < num4));
        System.out.println("num4 > num2 && num3 == num5: " + (num4 > num2 && num3 == num5));
        System.out.println("!(num1 > num4) || num3 <= num1: " + (!(num1 > num4) || num3 <= num1));

        System.out.printf("num1: %d num2: %d num3: %d num4: %d num5: %d\n", num1, num2, num3, num4, num5);
        
    }
}