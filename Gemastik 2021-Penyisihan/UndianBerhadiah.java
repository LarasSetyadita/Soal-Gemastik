import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UndianBerhadiah {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        short N = console.nextShort();
        int X = console.nextInt();
        ArrayList<Integer> Pemenang = new ArrayList<>();
        for (short i = 0; i < N; i++) {
            int input = console.nextInt();
            if (Pemenang.isEmpty() || Math.abs(Pemenang.get(0) - X) == Math.abs(input - X)) {
                Pemenang.add(input);
            } else if (Math.abs(Pemenang.get(0) - X) > Math.abs(input - X)) {
                Pemenang.clear();
                Pemenang.add(input);
            }
        }
        Collections.sort(Pemenang);
        for (Integer pemenang: Pemenang) {
            System.out.printf("%05d\n", pemenang);
        }
    }
}