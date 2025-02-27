package Day13;

// ---- 반복문 ----
// 프로그램에서 특정 코드를 일정 횟수만큼 반복시크는 문법
// for(), while(), do ~ while() 세 가지 반복문이 존재한다.
// 
//  - for() 문의 원형: 
//      for (초기식; 조건식(참이면 종속 문장 진행); 변화식) {
//          종속 문장(반복시킬 코드);
//      }
//  
//  - 코드 진행:
//  1. 초기식을 실행
//  2. 초기식 진행 후 바로 조건식을 체크, 참이면 종속 문장을 진행함.
//  3. 변화식을 진행하고 다시 조건식을 체크, 참이면 종속 문장 진행 반복
// 
// for 문에서 무한루프를 사용하고자 할 때는 조건식을 생략하면 된다.
// 또한, for 문으로 사용할 종속 문장이 한줄일 경우, 중괄호 생략 가능
// 

// ---- 기타 키워드 ----
// break: 이 키워드를 만나면 반복문 종료
// continue: 이 키워드를 만나면 아래 종속 문장은 실행하지 않고 다음 루프로 넘어감
// 

public class Loop {
    public static void main(String[] args) {
        // for(int i = 0; i<10; i++) {             // <-- 초기식에서 변수를 선언해주었다면 반복문 내부에서만 사용가능.
        //     System.out.println("Hello World!");
        // }
        // System.out.println("i의 값은: " + i); // <-- i 값이 10이 되는 이유는 변화식을 진행하고 조건식을 체크 후 반복문을 나오기 때문.

        // 무한루프를 멈추고자 한다면 터미널 창에서 Ctrl + c 입력(터미널 인터럽트 숏컷)
        // for(int i = 0;; i++) System.out.println("Hello World!" + i);

        for (int i = 0; i <10; i++) {
            if(i==5) {continue;}
            System.out.println("Hello world!\ti: " +i);
        }
    }
}
