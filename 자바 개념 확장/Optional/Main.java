public class Main {

    public static void main(String[] args) {

        Camp camp = new Camp();
        
        // isPresent() 활용시 true 를 반환하고 싶을때 활용
        // Student newStudent = new Student();
        // camp.setStudent(newStudent);

        //  Optional 객체 반환받음
        Optional<Student> studentOptional = camp.getStudent();

        // Optional 객체의 기능 활용
        boolean flag = studentOptional.isPresent(); // false 반환
        if (flag) {
            // 존재할 경우
            Student student = studentOptional.get(); // ✅ 안전하게 Student 객체 가져오기
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);

        } else {
            // null 일 경우
            System.out.println("학생이 없습니다.");
        }
    }
}