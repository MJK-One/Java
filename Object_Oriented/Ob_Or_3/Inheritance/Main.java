package Object_Oriented.Ob_Or_2.Inheritance;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.honor); // ✅ 부모의 속성을 물려받아 사용
        System.out.println(child.familyName); // ✅ 부모의 속성을 물려받아 사용
        child.introduceFamily(); // ✅ 부모의 메서드를 물려받아 사용
    }
}
