package Day04;
// Q1. 아래와 같이 출력되는 코드를 변수를 이용하여 작성하시오.
// 이름: 홍길동
// 나이: 30
// 주소: 서울특별시 종로구 묘동 단성사
// 키: 183.2cm    몸무게: 70.53kg

public class Variable_Practice {
    public static void main(String[] args) {
        int age = 30;
        double height = 183.2, weight = 70.53;
        float fHeight = ((float)height);
        float fWeight = 70.53f;
        System.out.println("---- Q1 정답 ----");
        System.out.printf("이름: %s\n", "홍길동");
        System.out.printf("나이: %d\n", age);
        System.out.printf("주소: %s\n", "서울특별시 종로구 묘동 단성사");
        System.out.printf("키: %.1fcm\t 몸무게: %.2fkg\n", height, weight);
        System.out.printf("키: %.1fcm\t 몸무게: %.2fkg\n", fHeight, fWeight);
        System.out.println();
    }
}
