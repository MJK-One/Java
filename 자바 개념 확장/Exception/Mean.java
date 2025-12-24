// **의도적인 예외  - `throw`**

// - 특정 조건에서 의도적으로 예외를 발생시킬 수도 있습니다.
//     - 비즈니스 규칙을 위반한 경우(미성년자접근)
// - 아래 코드에서 `age < 18`  조건을 만족하면 `IllegalArgumentException` 을 발생시킵니다.
// - `throw` 를 활용하면 특정 상황에서 예외를 명확하게 정의하고 제어할 수 있습니다.
public class Mean {
    public static void main(String[] args) {
        int age = 10;
        if (age < 18) {
		        // ✅ 의도적으로 예외를 발생시키는 부분
            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다!");
        }
        System.out.println("....");
    }
}
