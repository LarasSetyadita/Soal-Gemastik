import java.util.Arrays;
import java.io.*;
import java.util.StringTokenizer;
public class JangkauanBom {
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
      int xa = console.nextInt();
      int ya = console.nextInt();
      int M = console.nextInt();
      double [] musuh = new double [M];
      for (int i = 0; i < M; i++) {
         int x = console.nextInt();
         int y = console.nextInt();
         musuh [i]  = Math.pow((double)(x - xa), 2) + Math.pow((double) (y - ya), 2);      
      }
      Arrays.sort(musuh);
      int Q = console.nextInt();
      int [] h = new int [Q];
      for (int i = 0; i < Q; i++) {
         int a = console.nextInt();
         double b = Math.pow(a, 2);
         h[i] = ledakan(musuh, b);
      }
      for (int i = 0; i < Q; i++) {
         System.out.println(h[i]);
      }
   }
   public static int ledakan(double[] musuh, double b) {
      for (int i = 0; i < musuh.length; i++) {
         if (musuh[i] > b) return i;       
      }
      return musuh.length;
   }
}