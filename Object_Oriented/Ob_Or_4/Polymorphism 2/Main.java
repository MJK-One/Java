package Object_Oriented.Ob_Or_4.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // 다형성 활용
        Animal animal = new Cat();
        animal.exist(); // ✅
        animal.makeSound(); // ✅
        // animal.scratch(); 오류

        Cat cat = new Cat();
        cat.exist();
        cat.makeSound();
        cat.scratch();
    }
}

// - `다형성`은 하나의 타입으로 여러 객체를 다룰 수 있는 객체지향의 4번째 특징입니다.
// - 인터페이스 상속, 클래스 상속을 활용해서 추상계층을 표현해 왔습니다.
// - 이제 추상 계층이라는 특징을 활용해서 다형성을 구현할 수 있습니다.