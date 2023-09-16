import java.util.Scanner;
public class JalanJalanVirtual {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int N = console.nextInt();
      int koordinat[][] = new int [N + 1][2];
      for (int i = 0; i < N; i++) { 
         int L = console.nextInt();        
            koordinat [i][0] = 0;
            koordinat [i][1] = 0;
         for (int j = 1; j <= L; j++) {
            L = L - j + 1;
            int o = j;
            if (L < j) {
               o = L;
            }
            if (j % 4 == 1){
               koordinat[i][0]=koordinat[i][0] + o;
            } else if (j % 4 == 2){
               koordinat[i][1]=koordinat[i][1] + o;
            } else if (j % 4 == 3){
               koordinat[i][0]=koordinat[i][0] - o;
            } else {
               koordinat[i][1]=koordinat[i][1] - o;
            }
         } 

      }
      
      for (int i = 0; i < N; i++) {
         System.out.println(koordinat[i][0] + " " + koordinat[i][1]);
      }
      
   }
}