// ---- printf() ----
// printf() 의 경우, 출력하고자 하는 데이터의 서식을 저장하여 출력 가능.
// f: format
// printf 의 원형: printf("출력할 문자열 또는 서식 지정자", 넘겨줄 데이터);
// 여러 개의 데이터를 출력할 때는 서식 지정자와 넘겨줄 데이터의 개수를 맞춰서 작성해준다.
//    eg) printf("%c %c", 'A', 'F');

// ---- printf() 서식 지정자 ----
// %c : char, 문자 하나
// %s : string, 문자열
// %d : decimal, 정수
// %f : float, 실수. 소숫점 자리수를 지정하고자 할때 %와 f 사이에 . 과 숫자를 입력하면 됩니다(eg: %.2f).
// %o : octal, 8진수 정수
// %x : hexadecimal, 16진수 정수
// %% : 퍼센트 출력(escape)

// 서식 지정자에서 오른쪽 정렬: % 와 서식 지정자 사이에 자연수를 입력 (eg: %3d | 3칸의 스페이스를 주고 오른쪽 정렬)
// ----- 오른쪽 정렬을 진행하고 남은 칸에 0을 채워넣기: 입력한 자연수 앞에 0을 추가 (eg: %03d | 3칸의 스페이스를 주고 오른쪽 정렬 한 뒤 남은 칸을 0으로 채움)
// 서식 지정자에서 왼쪽 정렬: %와 서식 지정자 사이에 음수를 입력 (eg: %-3d | 3칸의 스페이스를 주고 왼쪽 정렬)

// ---- 제어 문자 ----
// 출력 결과를 제어해주는 문자
// \n: New line: 새로운 줄, 개행, 커서를 다음 줄로 옮김.
// \t: Tab: 탭, 탭 만큼의 공간 확보
// \": "(큰따옴표) 출력
// \': '(작은따옴표) 출력 


package Day03;

public class Printf02 {
  public static void main(String[] args) {
    System.out.printf("Hello World");
    System.out.println();
    System.out.printf("%c", 'J');
    System.out.printf("%s","ava");
    System.out.printf("%d", 1);
    System.out.printf("%.1f",7.0);
    System.out.println();

    System.out.printf("%c %5c", 'A', 'F');
    System.out.printf("%5d %d", 10, 20);
    System.out.println();

    System.out.printf("%e\n", 12345678901234567890.0);
    System.out.printf("%E\n", 12345678901234567890.0);

    System.out.printf("%% %5d %05d %-5d %%c", 1, 2, 3);
    System.out.println();
    
    System.out.printf("\tHello\tWorld\n");
    System.out.printf("\"Hello\"\n");
    System.out.printf("\'Hello\'\n");
    System.out.println();

    System.out.printf("\u00A9");

  }
}

