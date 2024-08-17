package Basic;

public class DataType {
    public static void main(String[] args) {
        // 프로그래밍 언어 : 컴파일 언어(java,c,c++,ts,...) vs 인터프리터 언어(js, py)
        //                데이터 타입  변수명 = 값            const 변수명 = 값

        // 기본 데이터 타입
        // RAM[4byte 쓸게]
        // 4byte -> 32bit

        // 1bit[전구하나]: 2^1
        // 2 [전구두개] : 2^2
        // 32 : 2^31(+- 0~2^31) +1[부호비트]

        int num = 1; // 숫자 - 정수(integer[4byte]), 실수(double[8byte], float[4byte])
        double pi = 3.14;
        boolean is12 = true; // 불리언 [1byte(8bit)]
        char initial = 'K'; // 문자 [2byte(16bit) 2^16]

        // 참조 데이터 타입
        // Salguksu a; 유동적인 데이터 타입을 참조 타입 [heap(동적) 메모리]
        String lunch = "쌀국수"; // 문자열
        System.out.println(num);
        System.out.println(pi);
        System.out.println(is12);
        System.out.println(initial);
        System.out.println(lunch);
    }
}

