// Q1. 아래와 같이 출력되는 코드를 printf() 를 이용하여 작성하시오.
// 이름: 홍길동
// 나이: 30
// 주소: 서울특별시 종로구 묘동 단성사
// 키: 183.2cm    몸무게: 70.53kg

// Q2. 아래와 같이 출력되는 코드를 작성하시오.
// %c를 이용한 출력: 'C'
// %s를 이용한 출력: "Hello"
// %d를 이용한 출력: 4315
// %f를 이용한 출력: 73.235

package Day03;

public class Printf02_Practice {
    public static void main(String[] args) {
        System.out.println("---- Q1 정답 ----");
        System.out.printf("이름: %s\n", "홍길동");
        System.out.printf("나이: %d\n", 30);
        System.out.printf("주소: %s\n", "서울특별시 종로구 묘동 단성사");
        System.out.printf("키: %.1fcm\t 몸무게: %.2fkg\n", 183.2, 70.53);
        System.out.println();

        System.out.println("---- Q2 정답 ----");
        System.out.printf("%%c를 이용한 출력: '%c'\n", 'C');
        System.out.printf("%%s를 이용한 출력: \"%s\"\n", "Hello");
        System.out.printf("%%d를 이용한 출력: %d\n", 4315);
        System.out.printf("%%f를 이용한 출력: %.3f\n", 73.235);
    }    
}
