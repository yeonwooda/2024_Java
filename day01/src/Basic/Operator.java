package Basic;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        //1. 산술연산자
        // ++ 하나 증가, -- 하나 감소

        //2. 비교, 논리연산자
        // && and, || or , ! not

        //3. 삼항 연산자
        // 조건식 ? true : false

        // 퀴즈, 세 과목이름 입력 받고, 세 과목의 시험 점수를 입력 받고,
        // 세 과목의 평균이 60점 이상이면 합격 아니면 불합격 A,B,C 과목의 평균 합격 아니면 불합격
        Scanner sc = new Scanner(System.in);
        System.out.print("과목1");
        String course1 = sc.nextLine();

        System.out.print("과목2");
        String course2 = sc.nextLine();

        System.out.print("과목3");
        String course3 = sc.nextLine();

        System.out.printf("%s 과목의 점수 입력:",course1);
        int score1 = sc.nextInt();

        System.out.printf("%s 과목의 점수 입력:",course2);
        int score2 = sc.nextInt();

        System.out.printf("%s 과목의 점수 입력:",course3);
        int score3 = sc.nextInt();

        double avg = (double) (score1 + score2 + score3) /3;
        String result = avg >= 60 ? "합격" : "불합격";
        System.out.printf("%s %s %s의 평균은 %.2f 이므로 %s입니다", course1,course2,course3, avg,result);


    }
}
