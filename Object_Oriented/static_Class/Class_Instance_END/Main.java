package Object_Oriented.static_Class.Class_Instance_END;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("gygim");
        Person p2 = new Person("Steve");

        p1.printName();  // 인스턴스메서드는 객체 인스턴스화 이후에 호출 가능
        p2.printName();

        // 클래스 메서드는 클래스 이름으로 호출 가능
        Person.printPopulation();  // "현재 인구 수: 2"
    }
}