package Object_Oriented.Ob_Or_2.abstract_;

abstract class Animal {
    private String name; // 변수 선언 가능

    abstract void eat(); // ⚠️ 추상메서드: 상속 받은 자식은 강제 구현해야합니다.

    public void sleep() { // ✅ 자식클래스에서 재사용가능합니다.
        System.out.println("쿨쿨");
    }
}
