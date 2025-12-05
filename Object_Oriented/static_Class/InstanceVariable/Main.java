package Object_Oriented.static_Class.InstanceVariable;
// 인스턴스 변수.
// - 객체가 생성될 때마다 따로 만들어지는 변수입니다.
// - 객체를 생성한 후 접근할 수 있습니다.
// - `name` 변수는 각 객체마다 별도로 저장됩니다.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(); // p1 객체 생성
        p1.name = "gygim"; // ✅ p1 객체의 데이터에 접근
        
        Person p2 = new Person(); // p2 객체 생성
        p2.name = "Steve"; // ✅ p2 객체의 데이터에 접근
    }
}
