package Week1;

public class method_Calc {
    void calc(int number, int n1, int n2) {
        switch(number) {
            case 1 :
                System.out.println("+ : " + (n1 + n2));
                break;
            case 2 :
                System.out.println("- : " + (n1 - n2));
                break;
            case 3 :
                System.out.println("x : " + (n1 * n2));
                break;
            case 4 :
                System.out.println("/ : " + (n1 / n2));
                break;
        }
    }
}
