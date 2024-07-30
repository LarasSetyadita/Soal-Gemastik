import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class peserta implements Comparable<peserta> {
    private String kodePeserta;
    private int nilai1;
    private int nilai2;
    private int nilai3;

    public peserta(String kodePeserta, int nilai1, int nilai2, int nilai3) {
        this.kodePeserta = kodePeserta;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public String getKodePeserta() {
        return kodePeserta;
    }

    public int getNilai1() {
        return nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    @Override
    public int compareTo(peserta other) {
        if (this.nilai3 != other.nilai3) {
            return other.nilai3 - this.nilai3;
        } else if (this.nilai2 != other.nilai2) {
            return other.nilai2 - this.nilai2;
        } else {
            return other.nilai1 - this.nilai1;
        }
    }

    public void lihatData() {
        System.out.printf("%12s, %5d, %5d, %5d\n", getKodePeserta(), getNilai1(), getNilai2(), getNilai3());
    }
}

public class KolamIkan {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int T = console.nextInt();
        for (int l = 0; l < T; l++) {
            int N = console.nextInt();
            int M = console.nextInt();
            ArrayList<peserta> pesertaLomba = new ArrayList<peserta>();
            String lolos = console.next();
            for (int j = 0; j < N; j++) {
                String kode = console.next();
                int n1 = console.nextInt();
                int n2 = console.nextInt();
                int n3 = console.nextInt();
                peserta pesertaBaru = new peserta(kode, n1, n2, n3);
                pesertaLomba.add(pesertaBaru);
                /*
                 * if (pesertaLomba.isEmpty()) {
                 * pesertaLomba.add(pesertaBaru);
                 * continue;
                 * } else {
                 * for (int i = 0; i < pesertaLomba.size() && i < M; i++) {
                 * if (pesertaBaru.getNilai3() > pesertaLomba.get(i).getNilai3()) {
                 * pesertaLomba.add(i, pesertaBaru);
                 * break;
                 * } else if (pesertaBaru.getNilai3() == pesertaLomba.get(i).getNilai3()) {
                 * if (pesertaBaru.getNilai2() > pesertaLomba.get(i).getNilai2()) {
                 * pesertaLomba.add(i, pesertaBaru);
                 * break;
                 * } else if (pesertaBaru.getNilai2() == pesertaLomba.get(i).getNilai2()) {
                 * if (pesertaBaru.getNilai1() > pesertaLomba.get(i).getNilai1()) {
                 * pesertaLomba.add(i, pesertaBaru);
                 * break;
                 * }
                 * }
                 * }
                 * if (i == pesertaLomba.size() - 1 || i == M - 1) {
                 * pesertaLomba.add(pesertaBaru);
                 * break;
                 * }
                 * }
                 * }
                 */

            }

            Collections.sort(pesertaLomba);

            boolean found = false;
            for (int k = 0; k < M; k++) {
                if (pesertaLomba.get(k).getKodePeserta().equals(lolos)) {
                    System.out.println("YA");
                    found = true;
                    break;
                }

            }
            if (!found) {
                System.out.println("TIDAK");
            }

        }
        console.close();

    }

}
