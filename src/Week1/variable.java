package Week1;

public class variable {
    // 변수
    public static void main(String[] args) {
        // 논리형
        boolean booleanBox = true; // booleanBox를 초기화
        booleanBox = false; // booleanBox 값을 false로 변경
        System.out.println("booleanBox = " + booleanBox); // 출력

        // 문자형
        char charBox = 'a';
        charBox = 'b';
        System.out.println("charBox = " + charBox);

        // 정수형
        byte byteBox = 1;
        byteBox = 2;
        System.out.println("byteBox = " + byteBox);

        // 정수형
        short shortBox = 1;
        shortBox = 2;
        System.out.println("shortBox = " + shortBox);

        // 정수형
        long longBox = 1;
        longBox = 2;
        System.out.println("longBox = " + longBox);

        // 실수형
        // 실수형(float) * 꼭 뒤에 f 를 붙여줘야합니다.
        float floatBox = 0.12345678f;
        floatBox = 0.1234567890f;
        System.out.println("floatBox = " + floatBox);

        // 실수형
        double doubleBox = 0.12345678901234567;
        doubleBox = 0.123456789012345678;
        System.out.println("doubleBox = " + doubleBox);

        // 다운 캐스팅
        double bigBox = 10.111;
        int smallBox = (int) bigBox;  // ✅ int <- double 명시적변환
        System.out.println(smallBox); // ✅ 출력: 10 !데이터손실발생!

        // 업 캐스팅
        int smallBox2 = 10;
        double bigBox2 = smallBox2;   // ✅ double <- int 자동형 변환
        System.out.println(bigBox2); // ✅ 출력: 10.0
    }
}
