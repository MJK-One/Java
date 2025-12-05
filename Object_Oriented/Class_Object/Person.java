package Object_Oriented.Class_Object;

public class Person {
    String name;
    String address;

    Person() {
    }

    void getName(String name) {
        this.name = name;
    }
    void setName(String name) {
        this. name = name;
    }
    void setAddress(String address) {
        this.address = address;
    }

    void introduce(){
        System.out.println("안녕하세요.");
        System.out.println("나의 이름은 " + this.name + "입니다.");
        System.out.println("주소는 " + this.address + "입니다.");
    }
}