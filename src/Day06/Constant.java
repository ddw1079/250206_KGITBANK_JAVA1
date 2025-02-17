package Day06;

// ---- Constant(상수) ----
// 상수(常數): 항상 같은 수, 변경할 수 없는 데이터
// 리터럴 상수(Literal Constant): 사용자가 작성하는 문자 그대로를 의미함. 문자, 문자열, 정수, 실수
// 심볼릭 상수(Symbolic Constant): 이름을 가지고 있는 상수
// 심볼릭 상수 선언 원형: final 자료형 상수명;
//                      final int con;


public class Constant {
    // 보통 이렇게 수정 불필요한 데이터에 사용됨.
    final String[] FIRST_MENU = {
        "1. add",
        "2. sub",
        "3. mult",
        "4. div",
        "0. exit"
    };
    public static void main(String[] args) {
        
        System.out.println("Hello");
        
        // 상수 선언
        final int CONSTANT = Integer.MAX_VALUE;

        System.out.println("CONSTANT 값: " + CONSTANT);

        // CONSTANT = Integer.MIN_VALUE; <-- final 로 심볼릭 상수로 지정하였으므로 수정할 수 없어 오류 발생.

    }
}
