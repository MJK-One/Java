package Object_Oriented.WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // ✅ 배열이 담긴 arr 는 참조형 변수입니다.
        System.out.println(arr); // ✅ 출력하면 @123 메모리의 주소값이 출력됩니다.

        Integer num = 123; // 래퍼클래스
        String str = num.toString(); // ✅ 편리한 기능

        int a = 100; // 그냥 데이터 100
        //String str = a.toString(); // ❌ 변환 불가

        // 래퍼클래스를 왜 사용하는가?
        // - 기본형은 객체처럼 속성, 기능을 가질 수 없습니다.
        // - 하지만 객체는 기능을 제공할 수 있습니다.
        // - 기본형을 감싼 객체를 만들어 기능을 제공하면 편리하게 데이터처리를 할 수 있습니다.
    }
}
