package RuntimeException_UncheckedException;

public class Main1 {
    public static void main(String[] args) {
        // 예외 실습 객체 인스턴스 화
        ExceptionPractice exceptionPractice = new ExceptionPractice();

        // ✅ 언체크 예외 호출
        exceptionPractice.callUncheckedException();

        // ❌ 예외처리를 해주지 않았기 때문에 프로그램이 종료됩니다.
        System.out.println("이 줄은 실행되지 않습니다."); 
    }
}
