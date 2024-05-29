import java.util.Scanner;
public class Pemenang {
   public static void main (String [] args) {
      Scanner console = new Scanner(System.in);
      int N = console.nextInt();
      String [] tim = new String [N];
      int [] skor = new int [N];
      int menang = 0;
      String no = "";
      for (int i = 0; i < N; i++) {
         tim[i] = console.next();
      }
      for (int i = 0; i < N - 1; i++) {
         for (int j = i + 1; j < N; j++) {
            int I = console.nextInt();
            int J = console.nextInt();
            if (I > J) {
               skor[i] = skor[i] + 3;
               skor[j] = skor[j] - 1;
            } else if (I < J){
               skor[i] = skor[i] - 1;
               skor[j] = skor[j] + 3;
            } else {
               skor[i] = skor[i] + 1;
               skor[j] = skor[j] + 1;
            }
         } 
      }
      for (int i = 0; i < N; i++) {
         if (menang < skor[i] || menang == skor[i] && no.compareTo(tim[i]) > 0) {
            menang = skor[i];
            no = tim[i];
         }         
      }
      System.out.print(no);
   }
}