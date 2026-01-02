public class Main {
  public static void main(String[] args) {
    Camp camp = new Camp();
    Student student = camp.getStudnet(); // student 에는 null 이 담김
    // ⚠️ 아래 코드에서 NPE 발생! 컴파일러가 잡아주지 않음
    String studentName = student.getName(); // 🔥 NPE 발생 -> 프로그램 종료
    System.out.println("studentName = " + studentName);
  }
}