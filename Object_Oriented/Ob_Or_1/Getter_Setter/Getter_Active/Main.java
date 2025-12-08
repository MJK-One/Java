package Object_Oriented.Ob_Or_1.Getter_Setter.Getter_Active;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.secret; // ❌ 직접 접근 불가능
        String newSecret = p1.getSecret(); // ✅ 게터를 활용해 접근가능
    }
}
