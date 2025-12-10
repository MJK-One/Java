package Object_Oriented.Ob_Or_2.Overriding;

public class Child extends Parent {
    @Override
    public void introduceFamily() { // ✅ 자식클래스에서 재정의
        System.out.println("오버라이드");
    }
}
