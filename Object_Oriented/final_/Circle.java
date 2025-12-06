package Object_Oriented.final_;

public class Circle {
    final static double PI = 3.14159; // 상수 선언
    double radius; // ⚠️ final 로 선언되어 있지 않기 때문에 외부에서 변경 가능

    Circle(double radius)  {
        this.radius = radius;
    }
}
