package RuntimeException_UncheckedException;

public class ExceptionPractice {
    public void callUncheckedException() {
        try {
            if (true) {
                System.out.println("체크 예외 발생");
                throw new Exception(); // ✅ 예외발생 
            }
        }
        catch (Exception e) {
                System.out.println("예외처리");
        }
        
    }
}
