import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FaktorisasiPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = 0;
        int pembilang = 0;
        int penyebut = 1;
        boolean[] prima = generatePrimes(n);
        ArrayList<Integer> bilangan = new ArrayList<Integer>();
        if (prima[n] == true) {
            System.out.println("1");
            return;
        }
        for (int i = 2; n != 1; i++) {
            m = 0;
            while (n % i == 0) {
                n = n / i;
                m++;
            }
            if (m >= 1)
                bilangan.add(m);

        }
        for (int i = 0; i < bilangan.size(); i++) {
            pembilang = pembilang + bilangan.get(i);
            penyebut = penyebut * faktorial(bilangan.get(i));
        }
        pembilang = faktorial(pembilang);
        System.out.println(pembilang / penyebut);

    }

    public static boolean[] generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int m = p * p; m <= n; m += p) {
                    isPrime[m] = false;
                }
            }
        }
        return isPrime;

    }

    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
