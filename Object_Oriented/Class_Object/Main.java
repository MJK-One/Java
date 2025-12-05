package Object_Oriented.Class_Object;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("홍길동");
        p1.setAddress("대한민국");
        p1.introduce();
        p2.introduce();
    }
}
