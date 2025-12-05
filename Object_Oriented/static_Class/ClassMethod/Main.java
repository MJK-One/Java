package Object_Oriented.static_Class.ClassMethod;

public class Main {
    public static void main(String[] args) {
		    
		    // ✅ 객체생성 여부에 상관없이 사용 가능
        Person.printPopulation(); // 현재 인구 수: 0

        Person p1 = new Person("gygim"); // 생성시마다 population 1 증가
        Person p2 = new Person("Steve"); // 생성시마다 population 1 증가

        Person.printPopulation(); // 현재 인구 수: 2
    } 
}
