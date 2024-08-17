package Basic;

import java.util.Scanner;

public class Input {
    //        붕어빵 b = new 붕어빵();
//        잉어빵 c =  new 잉어빵();
//        쌀국수 d = new 쌀국수();
//        붕어빵 e = new 슈크림맛붕어빵();

    public static void main(String[] args) {
//        Scanner b = new Scanner(System.in); // prompt 역할
//        System.out.print("숫자 입력:");
//        int c = b.nextInt(); // 유저에게 정수를 입력받는 함수
//        System.out.printf("당신이 입력한 숫자는 %d입니다.",c);

        // 유저에게 두 정수를 입력 받고, 합,차, 곱을 출력하는 프로그램
        Scanner d = new Scanner(System.in);
        System.out.print("첫번째 숫자입력: ");
        int f = d.nextInt();
        Scanner e = new Scanner(System.in);
        System.out.print("두번째 숫자입력: ");

        int g = e.nextInt();
        System.out.printf("%d %d %d",f+g, f-g, f*g);

        System.out.print("이름 입력");
        String name = d.nextLine();

    }
}
