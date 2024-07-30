import java.io.*;
import java.util.StringTokenizer;

public class MinES {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }

    public static void main(String[] args) {
        FastReader input = new FastReader();

        String[][] sandi1 = {{"AB", "DC", "CC", "CB"}, {"CA", "DA", "CD", "DD"}, {"BC", "AA", "BA", "DB"}, {"BD", "AD", "BB", "AC"}};
        String[][] sandi2 = {{"CD", "BB", "AC", "CC"}, {"CB", "DB", "AD", "DD"}, {"DA", "DC", "BC", "BD"}, {"AA", "BA", "CA", "AB"}};

        String hasil = "";
        String pesan = input.next();

        for (int i = 0; i < pesan.length(); i += 2) {
            String x = pesan.charAt(i) + String.valueOf(pesan.charAt(i + 1));
            hasil += sandi(sandi1, sandi(sandi2, x));
        }

        System.out.println(hasil);
    }

    public static String sandi(String[][] array, String sandi) {
        int a = -1, b = -1;
        String hasil = "";
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                if (array[j][k].equals(sandi)) {
                    a = j;
                    b = k;
                }
            }
        }

        switch (a) {
            case 0 -> hasil += "A";
            case 1 -> hasil += "B";
            case 2 -> hasil += "C";
            case 3 -> hasil += "D";
        }
        switch (b) {
            case 0 -> hasil += "A";
            case 1 -> hasil += "B";
            case 2 -> hasil += "C";
            case 3 -> hasil += "D";
        }
        return hasil;
    }
}