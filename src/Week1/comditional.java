package Week1;

import java.util.Scanner;

public class comditional {
    public static void main(String[] args) {
        Scanner ligthbox = new Scanner(System.in);

        System.out.print("신호등 색상을 입력(초, 노 ,빨) : ");
        String light = ligthbox.nextLine();
        System.out.println("신호등 색상 : " + light);

        // else if
        if(light.equals("초")) {
            System.out.println("건너");
        } else if (light.equals("노")){
            System.out.println("주의");
        } else {
            System.out.println("멈춰");
        }

        // switch
        int number = 1;

        switch (number) {
            case 1:
                System.out.println("1 입니다.");
                break;
            case 2:
                System.out.println("2 입니다.");
                break;
            default:
                System.out.println("1 도 아니고 2도 아닙니다.");
        }
    }
}
