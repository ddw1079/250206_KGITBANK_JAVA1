package Day14;

// ---- 반복문 ----
// while 문의 원형:
//  초기식;
//  while(조건식) {
//      종속 문장 및 변화식;
//  }
// 
// while 문에서의 초기식은 while 바깥에 존재하여야 하고, 변화식은 종속 문장과 같이 존재한다.
// while 문에서 무한루프를 사용하고자 할 때는 조건식에 (true) 만 작성하면 됨.
// while 문에서도 종속 문장이 한 줄 일 때는 종속문장을 감싸는 중괄호를 생략할 수 있음.
// 

public class Loop02 {
    public static void main(String[] args) {
        int i = 0;

        while (i<10) {
            System.out.println("Hello World!");
            i++;
        }

        // // 무한루프
        // while (true) {
        //     System.out.println("Hello World!");
        // }
    }
}
