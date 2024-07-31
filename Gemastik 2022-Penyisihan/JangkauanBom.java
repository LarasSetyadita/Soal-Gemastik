import java.util.Arrays;
import java.io.*;
import java.util.StringTokenizer;

public class JangkauanBom {
   static class FastReader {
      BufferedReader br;
      StringTokenizer st;

      public FastReader() {
         br = new BufferedReader(new InputStreamReader(System.in));
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

      int nextInt() {
         return Integer.parseInt(next());
      }

      long nextLong() {
         return Long.parseLong(next());
      }

      double nextDouble() {
         return Double.parseDouble(next());
      }

      String nextLine() {
         String str = "";
         try {
            if (st.hasMoreTokens()) {
               str = st.nextToken("\n");
            } else {
               str = br.readLine();
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
         return str;
      }
   }

   public static void main(String[] args) {
      FastReader console = new FastReader();
      StringBuilder output = new StringBuilder();
      long xa = console.nextInt();
      long ya = console.nextInt();
      int M = console.nextInt();
      long[] musuh = new long[M];

      for (int i = 0; i < M; i++) {
         int x = console.nextInt();
         int y = console.nextInt();
         musuh[i] = radiusLawan(xa, ya, x, y);
      }

      Arrays.sort(musuh);

      int Q = console.nextInt();
      for (int j = 0; j < Q; j++) {
         long b = console.nextLong();
         // menyimpan hasil ke string builder sebagai string "n" sebagai string tambahan
         output.append(ledakan(musuh, b * b)).append("\n");
      }
      System.out.print(output.toString());

   }

   public static int ledakan(long[] musuh, double b) {
      int left = 0;
      int right = musuh.length - 1;
      while (left <= right) {
         int mid = left + (right - left) / 2;
         if (musuh[mid] > b) {
            right = mid - 1;
         } else {
            left = mid + 1;
         }
      }
      return left;
   }

   public static long radiusLawan(long x1, long y1, long x2, long y2) {
      return (long) ((x2 - x1) * (x2 - x1)) + (long) ((y2 - y1) * (y2 - y1));
   }

}