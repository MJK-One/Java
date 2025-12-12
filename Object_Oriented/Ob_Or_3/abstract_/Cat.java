package Object_Oriented.Ob_Or_2.abstract_;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("냠냠"); //  ⚠️ 자식클래스에서 강제 구현해야합니다.
    }
}
