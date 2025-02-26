package Week1;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // for
        for (int i = 1; i <= 10; i++) {
            System.out.println("안녕하세요!");
        }

        // break
        int customers = 5;

        for (int i = 1; i <= customers; i++) {
            if (i == 4) {
                break; // (1) 반복을 벗어납니다.
            }
            System.out.println(i + "번째 손님, 안녕하세요!");
        }
        System.out.println("반복문이 종료되었습니다.");

        // continue
        int customers2 = 5;

        for (int i = 1; i <= customers2; i++) {
            if (i == 2) {
                continue; // (1) 반복을 건너 뜁니다.
            }
            System.out.println(i + "번째 손님, 안녕하세요!");
        }
        System.out.println("반복문이 종료되었습니다.");

        // while
        int i = 1;
        while (i <= 10) { // 1은 10보다 작음으로 반복!
            System.out.println("i 가 10 보다 작습니다.");
            i++; // ✅ 없을 경우 무한루프 발생
        }

        // do-while
        int di = 1;
        do {
            System.out.println("안녕하세요.");
            di++;
        } while (di <= 10);

        // 구구단
        for (int j = 1; j<= 9; j++) {
            for (int k = 1; k <= 9; k++) {
                System.out.printf("%d * %d = %d\n", j, k, j * k);
            }
        }
    }
}
