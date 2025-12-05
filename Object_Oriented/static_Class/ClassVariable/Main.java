package Object_Oriented.static_Class.ClassVariable;

public class Main {
    public static void main(String[] args) {
        // 객체 생성 전에도 클래스 레벨에서 직접 접근 가능
        System.out.println("현재 인구 수:" + Person.population);

        Person p1 = new Person();
        Person p2 = new Person();

        // 모든 객체가 하나의 값을 공유
        System.out.println("현재 인구 수:" + p1.population);
        System.out.println("현재 인구 수:" + p2.population);
    }
}
