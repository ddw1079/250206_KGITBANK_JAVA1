package Day06;

// ---- 산술 연산자 ----
// + : 왼쪽의 피연산자에서 오른쪽의 피연산자를 더함.
// - : 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺌.
// * : 왼쪽의 피연산자에서 오른쪽의 피연산자를 곱함.
// / : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눔.
// % : 왼쪽의 피연산자를 오른쪽의 피연산자로 나누어 나머지 반환. 나머지연산(modulo 연산)

// ---- 연산자 우선순위 ----
// 1. () [] 괄호/대괄호
// 2. ! ~ ++ -- 비트 논리 부정, flip / 산술 증감 연산자
// 3. * / % 곱셈/나눗셈/나머지 연산자
// 4. + - 덧셈/뺄셈 연산자
// 5. >> << 비트 쉬프트 연산자
// 6. > < >= <= 관계 연산자
// 7. != == 비트 관계 연산자
// 8. & 비트 논리 and 연산자
// 9. ^ 비트 논리 xor 연산자
// 10. | 비트 논리 or 연산자
// 11. && 논리곱(and) 연산자
// 12. || 논리합(or) 연산자
// 13. ?: 3항 조건 연산자
// 14. = += -= 등 대입, 할당 연산자

public class Operators {
    public static void main(String[] args) {
        System.out.println("10+3 : " + (10+3));
        System.out.println("10-3 : " + (10-3));
        System.out.println("10*3 : " + (10*3));
        System.out.println("10/3 : " + (10/3));
        System.out.println("10%3 : " + (10%3));
        System.out.println("10<<3 : " + (100<<3));
        System.out.println("10>>3 : " + (100>>3));
        System.out.println(true&false);
        System.out.println(true^false);
        System.out.println(true|false);
        
    }
}
