package Object_Oriented.Ob_Or_1.Robot;

// 시나리오2: 로보트를 걷게 만들자
// public class Robot {
//     private boolean leftLeg;
//     private boolean rightLeg;
// }

// 해결책 1: 세터 추가
// public class Robot {
//     private boolean leftLeg;
//     private boolean rightLeg;

//     public void setLeftLeg(boolean power) {
//         this.leftLeg = power;
//     }

//     public void setRightLeg(boolean power) {
//         this.rightLeg = power;
//     }
// }
//- 왼쪽 다리와 오른쪽 다리를 각각 움직일 수 있도록 `setLeftLeg()`와 `setRightLeg()` 메서드를 만들었다.
//- 클래스를 사용할 때 잘 활용. 하지만 고려해야 할 속성들이 많아진다면 각 각의 세터를 다루는 게 쉬운 일은 아니다.

// 해결책 2: 걷기 라는 동작을 직접 제공하기
public class Robot {
    private boolean leftLeg;
    private boolean rightLeg;
    private boolean leftArm;
    private boolean rightArm;
    private boolean leftEye; 
    private boolean rightEye;

    public void walk(boolean power) {
        System.out.println("🚶 왼쪽 다리 앞으로!");
        leftLeg = power;

        System.out.println("🚶 오른쪽 다리 앞으로!");
        rightLeg = true;
    }
}