package Object_Oriented.Interface.good_case;

public class LuxuryCar implements Car {

    @Override
    public void drive() { // ✅ 인터페이스 규칙 준수
        System.out.println("멋지게 이동합니다.");
    }

    @Override
    public void stop() {  // ✅ 인터페이스 규칙 준수
        System.out.println("브레이크를 밟아 정지합니다.");
    }

    void charge() { // CarA 만의 기능을 확장 가능합니다.
        System.out.println("차량을 충전합니다");
	}
}