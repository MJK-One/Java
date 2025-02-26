package Week1;

import java.util.Scanner;

public class scanner {
    // 입출력
    public static void main(String[] args) {
        // 출력 후 자동으로 줄 바꿈
        System.out.println("Hello");
        System.out.println("Java!");

        // 줄 바꿈 없이 출력됩니다.
        System.out.print("Hello");
        System.out.print("Java!");

        // 개행문자
        System.out.print("Hello\nJava!\n");

        // 문자열 입력 받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();  // 데이터 전달
        System.out.println("좋아하는 문장: " + sentence);

        // 숫자 입력 받기
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num1 = scanner2.nextInt();

        System.out.print("실수를 입력하세요: ");
        double num2 = scanner2.nextDouble();

        System.out.print("큰 정수를 입력하세요: ");
        long num3 = scanner2.nextLong();

        System.out.println("입력한 정수: " + num1);
        System.out.println("입력한 실수: " + num2);
        System.out.println("입력한 큰 정수: " + num3);

        // 이름과 나이 입력받아 출력하는 프로그램 작성
        Scanner nameScanner = new Scanner(System.in);
        Scanner ageScanner = new Scanner(System.in);

        String name = nameScanner.nextLine();
        String age = ageScanner.nextLine();

        System.out.println("출력 결과 :");
        System.out.println("이름" + name);
        System.out.println("나이" + age);
    }
}
