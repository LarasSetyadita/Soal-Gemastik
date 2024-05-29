import java.util.Scanner;

public class FlappyAngryBirds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] pipa = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                int a = input.nextInt();
                pipa[i][j] = a;
            }
        }
        boolean hasil = false;
        int ga = 0;
        int gb = 0;
        int ta = 0;
        int tb = 0;

        for (int i = pipa[0][1]; i >= pipa[0][0]; i--) { // mencari gradien
            if (hasil == true)
                break;

            for (int j = pipa[n - 1][0]; j <= pipa[n - 1][1]; j++) {
                double g = (double) (j - i) / (double) (n - 1);
                double ka = i - g;
                for (int k = 0; k < n; k++) { // uji gradien
                    double total = ka + (k + 1) * g;
                    if (total < pipa[k][0] || total > pipa[k][1]) {
                        hasil = false;
                        break; // gradien salah
                    }
                    hasil = true;
                }

                if (hasil == true) {
                    ga = j - i;
                    gb = n - 1;

                    ta = (n - 1) * i - 1 * ga;
                    tb = n - 1;
                    if (ta < 0)
                        hasil = false;
                    break;
                }
            }
        }
        if (hasil == true) {
            System.out.println("BISA");

            int fpbt = 1;
            for (int i = 1; i <= Math.min(ta, tb); i++) {
                if (ta % i == 0 && tb % i == 0) {
                    fpbt = i;
                }
            }
            ta = ta / fpbt;
            tb = tb / fpbt;
            System.out.printf("%d %d\n", ta, tb);

            int fpbg = 1;
            for (int i = 1; i <= Math.min(ga, gb); i++) {
                if (ga % i == 0 && gb % i == 0) {
                    fpbg = i;
                }
            }
            ga = ga / fpbg;
            gb = gb / fpbg;
            System.out.printf("%d %d\n", ga, gb);

        } else {
            System.out.println("TIDAK");
        }
    }
}
