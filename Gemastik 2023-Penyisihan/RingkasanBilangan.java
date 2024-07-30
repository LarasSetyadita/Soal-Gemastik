import java.util.*;
import java.util.Collections;
public class RingkasanBilangan{
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      ArrayList <Integer> number = new ArrayList<>();
      int N = console.nextInt();
      for(int i = 0; i <N ; i++) {
         int bil = console.nextInt();
         if (!number.contains(bil)) number.add(bil);
      }
      Collections.sort(number);
      int min = 0;
      int max = 0;
      for (int i = 0; i < number.size(); i++) {
         int angka = number.get(i);
         if (min == 0 && max == 0) {
            min = angka;
            max = angka;
         } else if (angka == max + 1) {
            max = angka;
         } else if (min == max) {
            System.out.print(min + ",");
            min = angka; max = angka;
         } else {
            System.out.print(min + "-" + max + ",");
            min = angka; max = angka;
         }
         
         if (i == number.size() - 1) {
            if (min == max){
               System.out.print(max);
            } else {
               System.out.print(min + "-" + max);
            }
         }
      }
   }
}