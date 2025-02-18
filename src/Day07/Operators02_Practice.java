package Day07;

// Q1) 다음 변수에 저장된 값을 예상해보세요.
// int a = 5, b = 6, c = 7, d;
// d = ++a * b--;
// d = a++ + ++c - b--;

// -- Q1 해설
// a=5, b=6, c=7
// d = ++a * b--
//   = (1+5) * (6)
//   = 36
// 
// a=6, b=5, c=7
// d = a++ + ++c - b--
//   = (6) + (1+7) - (5)
//   = 9
// 
// a=7, b=4, c=8

public class Operators02_Practice {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7, d;
        d = ++a * b--;
        System.out.printf("a: %d b: %d c: %d d: %d\n", a, b, c, d);
        d = a++ + ++c - b--;
        System.out.printf("a: %d b: %d c: %d d: %d\n", a, b, c, d);
        d=+d---a-b+++c;
        System.out.printf("a: %d b: %d c: %d d: %d\n", a, b, c, d);

    }
}