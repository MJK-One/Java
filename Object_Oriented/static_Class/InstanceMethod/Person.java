package Object_Oriented.static_Class.InstanceMethod;

public class Person {
    String name;
    
    void printName() { // 인스턴스 메서드
            System.out.println("나의 이름은 " + this.name + "입니다.");
    }
}
