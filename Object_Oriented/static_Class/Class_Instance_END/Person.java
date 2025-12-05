package Object_Oriented.static_Class.Class_Instance_END;

public class Person {
    static int population = 0; // 클래스 변수 (모든 객체가 공유)
    String name; // 인스턴스 변수

    public Person(String name) {
        this.name = name;
        population++; // 생성자 호출시 populataion 1 증가
    }

    public void printName() {
        System.out.println("이름: " + name);
    }

    public static void printPopulation() { // 클래스 메서드
        System.out.println("현재 인구 수: " + population);
    }
}
