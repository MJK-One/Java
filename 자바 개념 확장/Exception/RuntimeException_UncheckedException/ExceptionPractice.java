package RuntimeException_UncheckedException;

public class ExceptionPractice {
    public void callUncheckedException() {
        if (true) {
            System.out.println("언체크 예외 발생");
            throw new RuntimeException(); // ✅ 예외발생 
        }
    }
}
