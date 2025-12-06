package Object_Oriented.Interface.good_case;

public class Main {
    public static void main(String[] args) {
        LuxuryCar car1 = new LuxuryCar();
        SpeedCar car2 = new SpeedCar();

        // ✅ 각 차량의 공통 기능
        car1.drive();
        car1.stop();
        car2.drive();
        car2.stop();

        // ✅각 차량의 고유 기능
        car1.charge();
        car2.autoParking();
    }
}
