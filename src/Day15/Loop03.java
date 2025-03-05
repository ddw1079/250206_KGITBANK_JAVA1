package Day15;

// ---- 반복문 ----
// do ~ while() 문의 원형:
//  초기식;
// 
//  do {
//      종속 문장 및 변화식;
//  } while(조건식);
// 
// - 다른 반복문과는 다르게 종속 문장 및 변화식을 실행 후 조건을 체크함.
// 따라서ㅡ 종속 문장을 최소 한 번 이상 실행함.
// 조건식을 항상 참으로 만들면 무한루프로 사용 가능
// 

public class Loop03 {
    public static void main(String[] args) {
        int i = 7;

        do {
            System.out.println("i = " + i + " | Hello World!");
            i++;
        } while (i < 5);
    }
}
