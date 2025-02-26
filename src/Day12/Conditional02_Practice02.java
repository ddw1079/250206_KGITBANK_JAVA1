package Day12;

import java.util.Scanner;

public class Conditional02_Practice02 {
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
        avg = (kor + math + eng) / 3.0;

        switch ((int) (avg / 10)) {
            case 10:
                grade = "A";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        // if (avg >= 90) {
        // grade = "A";
        // } else if (avg >= 80) {
        // grade = "B";
        // } else if (avg >= 70) {
        // grade = "C";
        // } else if (avg >= 60) {
        // grade = "D";
        // } else {
        // grade = "F";
        // }

        System.out.println();
        System.out.printf("점수 평균: %.2f\n", avg);
        System.out.println("등급: " + grade);

        sc.close();
    }
}
