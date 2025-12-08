package Object_Oriented.Ob_Or_1.Getter_Setter.Setter_Active;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.secret = "password"; // ❌ 직접접근, 변경 불가능
        p1.setSecret("newPassword"); // ✅ 세터를 활용해 접근, 변경가능
    }
}