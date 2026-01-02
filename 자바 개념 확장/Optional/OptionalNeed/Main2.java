public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
        Student student = camp.getStudent();

        String studentName;
        if (student != null) { // ⚠️ 가능은하지만 현실적으로 어려움
            studentName = student.getName();
        } else {
            studentName = "등록된 학생 없음"; // 기본값 제공
        }

        System.out.println("studentName = " + studentName);
    }
}
