package Week1;

public class operator {
    // 연산자
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // 기본 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        // 나눗셈
        int div = a / b;
        System.out.println("div = " + div); // ⚠️ 3 (소수점 버려짐)

        double div2 = a / 3.0;
        System.out.println("div2 = " + div2); // ✅ 3.333... (소수점 유지)

        // 모듈러 연산자(나머지 연산자)
        int mod = 10 % 3;
        System.out.println("mod = " + mod); // 나머지: 1

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2); // 나머지: 3

        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3); // 나머지: 6

        // 복합 대입 연산자
        int num = 5;
        num += 3;  // num = num + 3;
        System.out.println("+= 결과: " + num); // 8

        num -= 2;  // num = num - 2;
        System.out.println("-= 결과: " + num); // 6

        num *= 2;  // num = num * 2;
        System.out.println("*= 결과: " + num); // 12

        num /= 3;  // num = num / 3;
        System.out.println("/= 결과: " + num); // 4

        num %= 3;  // num = num % 3;
        System.out.println("%= 결과: " + num); // 1

        // 증감 연산자 전위 후위
        // 전위 연산 ++i
        int ai = 5;
        System.out.println("++ai: " + (++ai));  // 6 (먼저 증가 후 출력)
        System.out.println("현재 ai 값: " + ai);  // 6

        // 후위 연산 i++
        int bi = 5;
        System.out.println("bi++: " + (bi++));  // 5 (출력 후 증가)
        System.out.println("현재 bi 값: " + bi);  // 6

        // 비교 연산자
        // 같음 연산자(==)
        System.out.println("10 == 10: " + (10 == 10)); // true

        // 다름 연산자(!=)
        System.out.println("10 != 5: " + (10 != 5)); // true

        // 크기 비교 연산자(>, <, <=, >=)
        System.out.println("10 < 5: " + (10 < 5)); // false
        System.out.println("10 >= 10: " + (10 >= 10)); // true
        System.out.println("10 <= 5: " + (10 <= 5)); // false


        // 논리 연산자
        // AND (&&) 두 조건이 모두 참일 때 true 를 반환합니다.

        System.out.println("true && true: " + (true && true));  // true
        System.out.println("true && false: " + (true && false)); // false
        System.out.println("false && false: " + (false && false)); // false

        int age = 20;
        boolean isStudent = true;
        System.out.println(age > 18 && isStudent); // true

        // OR (||) 둘 중 하나라도 참이면 true 를 반환합니다.
        System.out.println("true || false: " + (true || false)); // true
        System.out.println("false || false: " + (false || false)); // false
        System.out.println("true || true: " + (true || true)); // true


        int age1 = 20;
        boolean isStudent1 = true;
        System.out.println(age1 > 18 || isStudent1); // true

        // NOT 연산자( ! ) true 일때 false로, false 일때 true 로 변경합니다.
        System.out.println("!true: " + (!true));  // false
        System.out.println("!false: " + (!false)); // true


        int age2 = 20;
        boolean isStudent2 = true;
        System.out.println(age2 > 18 && isStudent2); // true

        // 문자열 비교
        String text1 = "Hello";
        String text2 = "Hello";
        boolean isEqual = text1.equals(text2);
        System.out.println("text1과 text2가 같은가? " + isEqual);
    }
}
