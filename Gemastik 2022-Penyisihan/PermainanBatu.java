import java.util.Scanner;
public class PermainanBatu {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      long N = console.nextLong();
      long K = console.nextLong();
      long M = console.nextLong();
      
      if (M % 2 == 0) {
         System.out.print("Kedua");
      } else {
         long a = batu(N-1) ^ batu(N-K-1);
         if (a == 0) {
            System.out.print("Kedua");
         } else {
            System.out.print("Pertama");
         }
      }
   }
   public static long batu (long n){
      if (n % 4 == 0) {
      return n;
      } else if (n  % 4 == 1){
         return 1;
      } else if (n % 4 == 2) {
         return n + 1;
      }
      return 0;
   }
}