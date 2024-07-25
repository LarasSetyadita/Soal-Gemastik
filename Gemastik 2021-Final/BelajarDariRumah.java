import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeMap;

public class BelajarDariRumah {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        TreeMap<Character, Integer> result = new TreeMap<Character, Integer>();

        int n = console.nextInt();
        String word;
        int len;
        Character a;
        int now;
        int prev;

        // menyimpan nilai di dalam arraylist
        for (int i = 0; i < n; i++) {
            word = console.next();
            words.add(word);
        }

        // mengecek
        for (int i = 0; i < words.size(); i++) {
            word = words.get(i);

            // menghitung setiap karakter
            for (int j = 0; j < word.length(); j++) {
                a = word.charAt(j);
                if (result.isEmpty() || !result.containsKey(a)) {
                    result.put(a, 1);
                } else {
                    int ab = result.get(a) + 1;
                    result.replace(a, ab);
                }
            }
            now = 2;
            // menghitung jumlah karakter
            for (Character c : result.keySet()) {
                prev = now;
                now = result.get(c) % 2;
                if (prev == 0 && now == 1 || prev == 1 && now == 0) {
                    now = 2;
                    break;
                }
            }
            System.out.println(now);
            result.clear();

        }

    }

}
