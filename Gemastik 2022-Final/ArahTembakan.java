import java.util.*;

public class ArahTembakan {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int N = console.nextInt();
      int M = console.nextInt();
      TreeMap<Double, Integer> musuhKanan = new TreeMap<Double, Integer>();
      TreeMap<Double, Integer> musuhKiri = new TreeMap<Double, Integer>();
      int max = 0;
      int nolA = 0;
      int nolB = 0;
      int[][] senjata = new int[2][N];
      int[][] lawan = new int[2][M];
      for (int i = 0; i < N; i++) {
         senjata[0][i] = console.nextInt();
         senjata[1][i] = console.nextInt();
      }
      for (int i = 0; i < M; i++) {
         lawan[0][i] = console.nextInt();
         lawan[1][i] = console.nextInt();
      }

      for (int i = 0; i < senjata.length; i++) {
         for (int j = 0; j < lawan.length; j++) {
            int dy = senjata[1][i] - lawan[1][j];
            int dx = senjata[0][i] - lawan[0][j];

            if (dx != 0) {
               double gradien = dy / dx;
               if (dx > 0) {
                  if (musuhKanan.isEmpty() || !musuhKanan.containsKey(gradien)) {
                     musuhKanan.put(gradien, 1);
                  } else {
                     int ab = musuhKanan.get(gradien) + 1;
                     musuhKanan.replace(gradien, ab);
                  }
               } else if (dx < 0) {
                  if (musuhKiri.isEmpty() || !musuhKiri.containsKey(gradien)) {
                     musuhKiri.put(gradien, 1);
                  } else {
                     int ab = musuhKiri.get(gradien) + 1;
                     musuhKiri.replace(gradien, ab);
                  }
               }

            } else {
               if (dy < 0) {
                  nolA++;
               } else {
                  nolB++;
               }
            }

         }

         int maxKanan = Collections.max(musuhKanan.values());
         int maxKiri = Collections.max(musuhKanan.values());
         max = Math.max(max, maxKanan);
         max = Math.max(max, maxKiri);
         max = Math.max(max, nolA);
         max = Math.max(max, nolB);

         nolA = 0;
         nolB = 0;
         musuhKanan.clear();
         musuhKiri.clear();
      }
      System.out.println(max);
   }
}