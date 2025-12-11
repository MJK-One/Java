package Object_Oriented.Ob_Or_2.abstract_;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal(); // ❌ 추상클래스는 구현할 수 없습니다.

        Cat cat = new Cat();
        cat.eat(); // ⚠️ 강제 구현한 메서드 사용
        cat.sleep(); // ✅ 부모클래스의 매서드 사용
    }
}
