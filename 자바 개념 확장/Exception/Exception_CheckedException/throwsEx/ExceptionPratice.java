package RuntimeException_UncheckedException.throwsEx;

public class ExceptionPractice {
    public void callUncheckedException() {
        if (true) {
            System.out.println("체크 예외 발생");
            throw new Exception(); // ✅ 예외발생 
        }
    }
}
