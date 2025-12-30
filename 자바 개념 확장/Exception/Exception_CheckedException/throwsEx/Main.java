public class Main {
  public static void main(String[] args) {
      // 예외 실습 객체 인스턴스화
      ExceptionPractice exceptionPractice = new ExceptionPractice();

      // 체크 예외 사용
      // 반드시 상위 메서드에서 try-catch를 활용해 주어야합니다.
      try {
          exceptionPractice.callUncheckedException();
      } catch (Exception e) {
          System.out.println("예외 처리");
      }
  }
}