package Object_Oriented.Ob_Or_2.super_;

public class Child extends Parent {

	private String familyName = "gim";

    public Child() {
        super(); // ✅ (1)부모클래스 생성자를 먼저 호출
        // 추가로직은 여기에 작성
    }

    // ✅ 부모에는 없지만 자식에만 있는 기능
    public void showSocialMedia() {
        System.out.println("우리 가문은 이제 SNS도 합니다. 팔로우 부탁드려요!");
    }
}

// - 부모가 먼저 생성되고 자식이 생성됩니다.
// - 부모가 먼저 생성되어야 하므로 `super()`는 항상 생성자의 첫 줄에 위치해야 합니다.

// - **부모클래스의 기능을 유지하면서 자식클래스에서 기능을 확장**할 수 있습니다.
// - 자식클래스에서 새로운 메서드를 추가하면 됩니다.