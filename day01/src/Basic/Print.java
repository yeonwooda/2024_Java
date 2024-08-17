package Basic;

public class Print {
    public static void main(String[] args) {
        // print, println [line next]
        System.out.print("점심");
        System.out.println("저녁에 할일");
        System.out.println("자바 첫 수업후기");

        int age = 21;
        System.out.println("당신의 나이는" + age + "입니다.");
        // formatter(바꿔주기)
        // %d - 정수, %f - 실수, %c - 문자, %s - 문자열, %b - 불리언
        System.out.printf("당신의 나이는 %d 입니다.", age );
        
        // 현재 코스피를 담는 변수를 선언해서 
        // 출력으로 현재 코스피는 ~~입니다.

        double KOSPI = 2697.23; // ctrl + shift + u하면 대문자
        System.out.printf("현재 코스피는 %.2f입니다.\n",KOSPI);

        
        // 저녁 메뉴 변수를 선언해서 데이터 넣고 아래오 ㅏ 같이 출력
        // 오늘 저녁 메뉴는 ~~입니다.
        String menu = "aaa";
        System.out.printf("오늘의 저녁 메뉴는 %s입니다.", menu);

    }
}