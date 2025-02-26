package Week1;

public class Array {
    public static void main(String[] args) {
        String[] adventurerList = {"gygim", "Steve", "Grace"};
        int arrLenght =  adventurerList.length;
        System.out.println("arrLenght: " + arrLenght);

        //배열 탐색
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            // ✅ 숫자대신 변수i 를 인덱스 활용
            System.out.println("numbers[" + i + "] = " + arr[i]);
        }
        // 향상된 for 문
        int[] arr2 = {100, 200, 300, 400, 500};
        for (int a : arr2) {
            System.out.println("배열의 각 요소 = " + a);
        }

        // 2차원 배열에서 검은돌(true)의 좌표(x, y) 찾기
        boolean[][] board = {
                {true, false},
                {false, true}
        };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.println("검은돌(●) 위치: (" + i + "," + j + ")");
                }
            }
        }
    }
}
