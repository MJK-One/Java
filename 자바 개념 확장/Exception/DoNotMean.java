// **의도하지 않은 예외**

// - 아래 코드에서 `10 / 0` 연산을 수행하면서 `ArithmeticException` (산술예외)가 발생합니다.
// - 0 으로 나누는 연산은 허용되지 않음으로 프로그램이 비정상적으로 종료됩니다.
// - 예외를 처리하지 않으면 이후 코드는 실행되지 않습니다.
public class DoNotMean {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        int result = 10 / 0; // ❌ 예외 발생 (ArithmeticException)
        System.out.println("이 문장은 실행되지 않음");
    }
}
