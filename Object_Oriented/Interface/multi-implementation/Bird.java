public class Bird implements Animal, Flyable {
    
    public void eat() {
        System.out.println("새가 먹이를 먹습니다.");
    }

    public void fly() {
        System.out.println("새가 하늘을 납니다.");
    }

    // 추가적으로 land() 메서드도 가능하지만 필수는 아님
    public void land() {
        System.out.println("새가 착륙합니다.");
    }
}
