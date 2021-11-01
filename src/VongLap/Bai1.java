package VongLap;

public class Bai1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("*******");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("\n");
            for (int j = 5; j >i; j--) {
                System.out.print("*");
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("\n");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
