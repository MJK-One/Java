package Basic.loop;

public class forPratice {
    public static void main(String[] args) {
        int customers = 5;
        
        // 3번째 손님까지만 받기
        for (int i = 1; i <= customers; i++) {
                if (i == 4) {
                        break; // (1) 반복을 벗어납니다.
                }
                System.out.println(i + "번째 손님, 안녕하세요!");
            }
            System.out.println("반복문이 종료되었습니다.");

    
        // int customers = 5;
        // // 2번째 손님 스킵
        // for (int i = 1; i <= customers; i++) {
        //         if (i == 2) {
        //                 continue; // (1) 반복을 건너 뜁니다.
        //         }
        //         System.out.println(i + "번째 손님, 안녕하세요!");
        //     }
        //     System.out.println("반복문이 종료되었습니다.");    
    }
}
