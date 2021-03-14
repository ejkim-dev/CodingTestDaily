import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test210314 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int val = Integer.parseInt(input);
        for (int i = 2; i <= val; i++) {
            while (val % i == 0){
                System.out.println(i);
                val /= i;
            }
        }

    }

}
