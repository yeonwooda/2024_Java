package Basic;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        // 조건문 : if문, switch문
        // ctrl + a : 전체선택
        // ctrl + alt + l : 자동 줄 맞춤
//        int num = 10;
//        if (num < 20) {
//            System.out.println("20보다 작음");
//        } else if (num < 30) {
//            System.out.println("30보다 작음");
//        } else {
//            System.out.println("30보다 큼");
//        }
        // 유저에게 정수를 입력받고, 양의 홀수, 양의 짝수, 0, 음의 홀수, 음의 짝수를 
        // 판별해주는 프로그램 만들기
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수입력:");
//        int num = sc.nextLine();
//
//        boolean isPositive = num > 0;
//        boolean isNegative = num <0;
//        boolean isOdd = num % 2 ==1;
//        boolean isEven = num % 2 == 0;
//
//        if (isPositive && isOdd){
//            System.out.println("양의 홀수");
//        } else if (isPositive && isEven) {
//            System.out.println("양의짝수");
//        } else if (isNegative && isOdd) {
//            System.out.println("음의 홀수");
//        } else if (isNegative && isEven){
//            System.out.println("음의 짝수");
//        }else{
//            System.out.println("0");
//        }

        int num = 1;
// obj <- switch
        switch (num) {
            case 1: // num이 1이라면
                System.out.println("숫자 1");
                break;
            case 2:
                System.out.println("숫자 2");
                break;
            case 3:
                System.out.println("숫자 3");
                break;
            default:
                System.out.println("1 2 3 아님");
                break;
        }

    }
}
