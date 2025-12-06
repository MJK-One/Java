package Object_Oriented.final_;

public class Main {
    public static void main(String[] args) {
        final Circle c1 = new Circle(2);
        // c1 = new Circle(3); // ❌ final은 변수 c1이 한 번 참조한 객체는 다른 객체로 변경될 수 없음을 의미함 (참조 불변)

        // 하지만 객체 내부의 속성 값은 변경 가능 (불변 객체가 아님)
        c1.radius = 3; // ⚠️ 내부 상태 변경 가능 (객체 자체가 불변이 아님)
    }
}