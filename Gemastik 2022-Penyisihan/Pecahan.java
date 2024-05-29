import java.util.Scanner;
public class Pecahan {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int A = console.nextInt();
      int B = console.nextInt();
      int C = console.nextInt();
      int D = console.nextInt();
      double y = (double) A / (double) B - (double) C / (double) D;
      if (y == 0) {
         System.out.print("sama");
      } else if (y < 0) {
         System.out.print("lebih kecil");
      } else if (y > 0) {
         System.out.print("lebih besar");
      }
   }
}