package Object_Oriented.static_Class.ClassMethod;

public class Person {
    static int population = 0;
    String name;
    
    public Person(String name) {
        this.name = name;
        population++; // 생성자 호출시 1 증가
    }

    static void printPopulation() {
		System.out.println("현재 인구 수: " + population); // 클래스 메서드
	}
}
