package Day11;

import java.util.Scanner;

// Q3) 학생의 국어, 수학, 영어 점수를 각각 입력 받고 평균을 구한 다음 평균 점수에 맞게 등급을 출력해보세요.
// 평균은 소수점 2번째 자리까지 출력.
// 등급은 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 나머지는 F
// 

public class Conditional_Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int kor, math, eng;
        double avg;
        String grade;

        System.out.println("---- 등급 출력기 ---- ");
        System.out.println("점수를 입력하세요. ");
        System.out.print("국어 점수: ");
        kor = sc.nextInt();
        System.out.print("수학 점수: ");
        math = sc.nextInt();
        System.out.print("영어 점수: ");
        eng = sc.nextInt();
        // avg = (double)(kor + math + eng)/3;
        avg = (kor + math + eng)/3.0;

        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println();
        System.out.printf("점수 평균: %.2f\n", avg);
        System.out.println("등급: " + grade);

        sc.close();
    }    
}
