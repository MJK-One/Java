package Object_Oriented.Interface.bad_case;

public class Main {
    public static void main(String[] args) {
        LuxuryCar car1 = new LuxuryCar();
        SpeedCar car2 = new SpeedCar();

        // ❌ 일관되지 않은 주행 명령어
        car1.move();
        car1.stop();
        
        // ❌ 일관되지 않은 주행 명령어 + 멈출수 없음
        car2.drive();

    }
}
