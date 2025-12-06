package Object_Oriented.Interface.good_case;

class SpeedCar implements Car {
		
	@Override
    public void drive() { // ✅ 인터페이스 규칙 준수
        System.out.println("빠르게 이동합니다.");
    }
    
    @Override
    public void stop() { // ✅ 인터페이스 규칙 준수
		    System.out.println("빠르게 정지합니다."); 
    }
    
    void autoParking() { // CarB 만의 기능을 확장 가능합니다.
		    System.out.println("자동 주차 기능을 실행합니다.");
    }
}
