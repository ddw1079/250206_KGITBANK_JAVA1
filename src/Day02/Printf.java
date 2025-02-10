// ---- printf() ----
// printf() 의 경우, 출력하고자 하는 데이터의 서식을 저장하여 출력 가능.
// f: format
// printf 의 원형: printf("출력할 문자열 또는 서식 지정자", 넘겨줄 데이터);
// 

// ---- printf() 서식 지정자 ----
// %c : char, 문자 하나
// %s : string, 문자열
// %d : decimal, 정수
// %f : float, 실수. 소숫점 자리수를 지정하고자 할때 %와 f 사이에 . 과 숫자를 입력하면 됩니다(eg: %.2f).
// %o : octal, 8진수 정수
// %x : hexadecimal, 16진수 정수
// %% : 퍼센트 출력(escape)


package Day02;

public class Printf {
  public static void main(String[] args) {
    System.out.printf("Hello World");
    System.out.println();
    System.out.printf("%c", 'J');
    System.out.printf("%s","ava");
    System.out.printf("%d", 1);
    System.out.printf("%.1f",7.0);
      
  }
}
