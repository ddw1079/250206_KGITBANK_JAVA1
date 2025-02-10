
// ---- 주석 ----
// 코드에 대한 추가 코멘트를 작성할 때 사용
// 기본적으로 // (슬래시 두개) 사용하여 주석 작성 가능
// 이 부분은 프로그램을 실행하는 데에 영향을 끼치지 않음
// 여러 줄을 한번에 주석처리 하고 싶을 때는 /* 와 */ 를 사용 

// ---- 출력 ----
// println() 메소드를 통해 출력을 진행할 수 있음
// println() 의 원형: println(출력 대상);
// 출력 대상에는 문자, 문자열, 정수, 실수, 변수가 들어갈 수 있다.
// print() 의 원형: print(출력 대상);
// println 과 달리 개행을 진행하지 않고 한 줄에 그대로 씀.
// 여러 방식의 데이터를 표현하고자 하면 '+' 기호로 이으면 된다.

// ---- Java에서 데이터 표기 방법 ----
// 문자(char): 한개의 문자는 '(작은따옴표)' 로 감싸준다.
// 문자열(string): 여러 문자는 "(큰따옴표)" 로 감싸준다.
// 정수: 숫자 그대로 작성한다.
// 실수: 숫자 뒤에 소숫점까지 작성한다.

package Day02;

public class Print02 {
	public static void main(String[] args) {
		System.out.println('a');
		System.out.println("ab");
		System.out.println(10);
		System.out.println(10.0);
		
		System.out.println("Hello");
		System.out.println(" World");
		System.out.print("World");
		System.out.print(" World");

		System.out.println("JDK" + 1 + 7.0);

	}
}
