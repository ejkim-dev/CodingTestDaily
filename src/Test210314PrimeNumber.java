import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test210314PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        int min = Integer.parseInt(input1);
        int max = Integer.parseInt(input2);

        ArrayList<Integer> decimals = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            for (int j = 2; j <= i; j++) {
                if ( i%j == 0 && j != i){
                    break;
                } else if (j == i) {
                    decimals.add(i);
                }
            }
        }

        if (decimals.size() > 0) {
            int sum = 0;

            for (int i = 0; i < decimals.size(); i++) {
                sum += decimals.get(i);
            }
            System.out.println(sum);
            System.out.println(decimals.get(0));
        } else {
            System.out.println(-1);
        }
    }
}
