package Basic;

public class TypeCasting {
    public static void main(String[] args) {
        // 타입 변환
        // 작은 범위 -> 큰 범위(암묵적 타입 캐스팅)
        int a = 10;
        int b = a;
        double c = a; // 실수 넓은 범위(정수)

        // (타입) : 타입 캐스팅 연산자
        // 강제적, 명시적 타입 캐스팅
        double d = 3.14;
        int e = (int)d;
    }
}
