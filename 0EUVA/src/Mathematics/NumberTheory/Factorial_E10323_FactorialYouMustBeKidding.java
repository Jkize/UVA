package Mathematics.NumberTheory;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
/**
 *
 * @author Jkize
 * Factorial You Must Be Kidding
 */
public class Factorial_E10323_FactorialYouMustBeKidding {

    public static void main(String[] args) throws IOException {
        String extraer[] = "40320 362880 3628800 39916800 479001600 6227020800".split(" ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String p;
        while ((p = in.readLine()) != null) {
            int n = Integer.parseInt(p);
            if (n > 0) { 
                if (n > 13) {
                    out.write("Overflow!\n");
                } else {
                    if (n <= 7) {
                        out.write("Underflow!\n");
                    } else {
                        out.write(extraer[n - 8] + "\n");
                    }
                }
            } else { 
                if (n % 2 != 0) {
                    out.write("Overflow!\n");
                } else {
                    out.write("Underflow!\n");
                }
            }
        }

    out.flush();
    

    }
}
