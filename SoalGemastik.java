import java.util.Scanner;

public class SoalGemastik {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();
        int c;
        if (a < b) {
            c = a;
            a = b;
            b = c;
        }
        if (a > b) {
            c = a + b;
        } else {
            a = b;
            b = a;
            c = a + b;
        }
        System.out.print(c);
    }
}
