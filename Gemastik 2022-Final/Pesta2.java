import java.util.Scanner;

public class Pesta2 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int a = 0; int b= 0; int c = 0;
      int N = console.nextInt();
      int total = 0;
      for (int i = 0; i < N; i++) {
         String h = console.next();
         switch (h) {
            case "1/2":
               a++;
               break;
            case "1/3":
               b++;
               break;
            case "1/6":
               c++;
               break;
         }
      }
      while (a != 0 || b != 0 || c != 0) {
         int x = 0; 
         while (x + 3 <= 6 && a != 0) {
            x += 3;
            a--;
         }
         while (x + 2 <= 6 && b != 0) {
            x += 2;
            b--;
         }
         while (x + 1 <= 6 && c != 0) {
            x += 1;
            c--;
         }
         total++;
      }

      System.out.print(total);
   }

}