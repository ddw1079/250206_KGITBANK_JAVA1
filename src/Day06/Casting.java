package Day06;

// ---- Casting(형 변환) ----
// 자바에서 연산이 진행될 대 모든 데이터가 같은 자료형으로 변환 후 연산이 진행되는 과정
// 예를 들어, int + double 이라면 int 데이터가 double 로 변환되어 연산 후에 출력됨.

// -- 자동 형 변환: JAVA에서 자동으로 진행되는 형 변환
// 형태가 다른 변수가 만나면 byte 크기가 큰 쪽으로 변환됨
// 순서: byte(1byte) -> short(2bytes) -> int(4bytes) -> long(4bytes) -> float(4bytes) -> double(8bytes)
//     - char 은 int 로만 변환됨.
//     - 정수와 실수가 붙으면 데이터 손실을 방지하기 위하여 실수 형태로 변환됨.

// -- 강제 형 변환: 사용자가 캐스트 연산자를 사용해 강제적으로 수행하는 형 변환
// 강제 형 변환을 진행하려면 변환하고자 하는 데이터 앞에 (변환할 데이터 타입) 을 작성

public class Casting {
    public static void main(String[] args) {
        System.out.println("int + double 연산 결과: ");
        System.out.println(3 + 5.3);
        System.out.println("int + (int)double 연산 결과 2: ");
        System.out.println(3 + (int) 5.9);

        // 심화: int 극한 + double 극한
        System.out.println("int + double 연산 결과: ");
        System.out.println(Integer.MAX_VALUE + Double.MAX_VALUE);
    }
}