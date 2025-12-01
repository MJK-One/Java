package Basic;

public class ArrayPratice2 {
    public static void main(String[] args) {
        // 자료형[] 변수이름 = new 자료형[배열의길이];
        boolean[][] board = new boolean[2][2];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                if(i == j) {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
