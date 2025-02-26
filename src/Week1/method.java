package Week1;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner numberchoice = new Scanner(System.in);
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);

        System.out.println("계산기");
        System.out.println("번호를 입력해주세요.");
        System.out.println("1.(+) 2.(-) 3.(x) 4.(/) :");
        int number = numberchoice.nextInt();
        System.out.println("계산할 숫자 2개를 입력해주세요(입력하고 Enter).");
        int n1num = n1.nextInt();
        int n2num = n2.nextInt();

        method_Calc calc = new method_Calc();
        calc.calc(number, n1num, n2num);
    }
}
