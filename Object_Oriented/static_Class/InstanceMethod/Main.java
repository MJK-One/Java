package Object_Oriented.static_Class.InstanceMethod;
// 인스턴스 메서드.
// - 객체의 속성을 활용하는 메서드입니다.
// - 객체가 생성된 후에만 사용할 수 있습니다.
public class Main {
    public static void main(String[] args) {
        
        Person p1 = new Person(); 
        p1.name = "gygim";
        p1.printName(); // p1 객체의 메서드 실행
        
        Person p2 = new Person();
        p2.name = "Steve";
        p2.printName(); // p2 객체의 메서드 실행
    }    
}
