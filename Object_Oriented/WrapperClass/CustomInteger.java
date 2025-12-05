package Object_Oriented.WrapperClass;

public class CustomInteger {
    int value;

    CustomInteger(int value) {
        this.value = value;
    }

    // 값을 가져오는 메서드
    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    // toString() 오버라이딩
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
