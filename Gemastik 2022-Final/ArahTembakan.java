import java.util.Scanner;
public class ArahTembakan {
   public static void main (String[] args) {
      Scanner console = new Scanner(System.in);
      int N = console.nextInt();
      int M = console.nextInt();
      int max = 0; 
      int [][] senjata = new int[2][N];
      int [][] lawan = new int[2][M];
      for (int i = 0; i < N; i++) {
         senjata [0][i] = console.nextInt();
         senjata [1][i] = console.nextInt();
      }
      for (int i = 0; i < M; i++) {
         int x = console.nextInt();
      }
   
   }
}