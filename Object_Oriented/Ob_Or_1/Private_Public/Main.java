package Object_Oriented.Ob_Or_1.Private_Public;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(); // ✅ 접근가능 생성자가 public
        person.name;                  // ✅ 접근가능 변수가 public
        person.secret;                // ❌ 접근불가능 변수가 private
        person.methodA();             // ✅ 접근가능 메서드가 public
        person.methodB();             // ❌ 접근불가능 메서드가 private
    }
}
