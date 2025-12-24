package try_catch_Act;

public class Main2 {
     public static void main(String[] args) { 
        ExceptionPractice exceptionPractice = new ExceptionPractice();

        // ✅ 상위로 전파된 예외처리
        try {
            exceptionPractice.callUncheckedException();
        } catch (RuntimeException e) { // ✅ 예외처리
            System.out.println("언체크 예외 처리"); 
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }
        System.out.println("프로그램 종료");
     }
}
