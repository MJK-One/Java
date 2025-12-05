package Object_Oriented.WrapperClass;

public class Main {
    public static void main(String[] args) {
        CustomInteger num1 = new CustomInteger(100);
        System.out.println(num1);
        System.out.println(num1.getValue());

        num1.setValue(200);
        System.out.println(num1);


        //기본형 → 래퍼형으로 변환하는 과정을 오토박싱
        Integer num2 = 10; // 오토박싱
        Integer num3 = Integer.valueOf(10); // 내부적 자동 처리(래퍼형 <- 기본형)

        //래퍼형 → 기본형으로 변환하는 과정으로 오토언박싱
        Integer num4 = 10; 
        int num5 = num4;   // ✅ 오토 언박싱
        // int a = num5.intValue(); // 내부적 자동처리(기본형 <- 래퍼형)


    }
}
