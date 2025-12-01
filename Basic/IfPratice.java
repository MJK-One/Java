package Basic;

public class IfPratice {
    public static void main(String[] args) {
        String light = "초록불";

        if (light.equals("초록불")) {
            System.out.println("건너세요");
        } else if (light.equals("노란불")) {
            System.out.println("잠시만 기다리세요.");
        } else {
            System.out.println("건너지 마세요.");
        }
    }

}
