package Basic;

import java.util.Scanner;

public class ScannerPratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        String input = sc.nextLine();
        System.out.println(input);
        sc.close();
    }
}
