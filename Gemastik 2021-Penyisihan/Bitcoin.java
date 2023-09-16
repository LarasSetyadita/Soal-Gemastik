import java.io.*;
import java.util.StringTokenizer;
public class Bitcoin {
   static class FastReader {
      BufferedReader br;
      StringTokenizer st;
     
      public FastReader(){
         br = new BufferedReader(
         new InputStreamReader(System.in));
      }
     
      String next(){
         while (st == null || !st.hasMoreElements()) {
             try {
                st = new StringTokenizer(br.readLine());
             } catch (IOException e) {
                e.printStackTrace();
             }
         }
         return st.nextToken();
      }
     
      int nextInt() { return Integer.parseInt(next()); }
     
      long nextLong() { return Long.parseLong(next()); }
     
      double nextDouble() {return Double.parseDouble(next()); }
     
      String nextLine() {
         String str = "";
         try {
            if(st.hasMoreTokens()) {
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
      int N = console.nextInt();
      int harga[] = new int[N];
      int min = 0;
      int total = 0;
      if (N != 0) {
         for(int i = 0; i < N; i++) {
            harga[i] = console.nextInt();
            if (i == 0) {
               min = harga[i];
            } else {
               if (harga [i] < harga [i - 1]) {
                  total += harga[i - 1] - min;
                  min = harga[i];
               } else if ( i == N - 1) {
                  total += harga[i] - min;
               }
            }
         }
      }
      System.out.print(total);
   }
}