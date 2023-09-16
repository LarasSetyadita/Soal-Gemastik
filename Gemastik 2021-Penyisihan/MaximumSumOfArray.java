import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
public class MaximumSumOfArray {
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
   public static void main (String[] args) {
      FastReader console = new FastReader();
      int N = console.nextInt();
      int M = console.nextInt();
      int bil [] = new int [N];
      for (int i = 0; i < N; i++) {
         bil[i] = console.nextInt();
      }
      int max = -101;
      int maxAr = -101;
      for(int i = 0; i < N; i++) {
         if (i >= M) {
            max = Math.max(max, bil[i-M]);
            bil[i] = Math.max(bil[i] + max, bil [i]);
         }
         maxAr = Math.max(maxAr, bil[i]);
      }
      System.out.print(maxAr);
   }
}