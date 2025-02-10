// ---- 출력 문제:
// Q1. 아래와 같이 출력되는 코드를 작성해보세요.
// 
// 웃음: (*^o^*)
// 사랑: (♥.♥)
// 슬픔: (ㅠ.ㅠ)
// 화남: (-_-^)
// 
// Q2. 아래와 같이 출력되는 코드를 작성해보세요. 콤마 옆의 데이터는 분리하십시오.abstract 
// 
// 이름: 홍길동
// 나이: 30
// 주소: 서울특별시 종로구 묘동 단성사
// 키: 183.2cm    몸무게: 70.53kg

package Day02;

public class Print02_Practice {
  public static void main(String[] args) {
    		// 출력 문제 답.
		System.out.print("웃음: ");
		System.out.println("(*^o^*)");
		System.out.print("사랑: ");
		System.out.println("(♥.♥)");
		System.out.print("슬픔: ");
		System.out.println("(ㅠ.ㅠ)");
		System.out.print("화남: ");
		System.out.println("(-_-^)");
		System.out.println();

		System.out.println("이름: " + "홍길동");
		System.out.println("나이: " + 30);
		System.out.println("주소: " + "서울특별시 종로구 묘동 단성사");
		System.out.print("키: " + 183.2 + "cm");
		System.out.println("    몸무게: " + 70.53 + "kg");
  }
}
