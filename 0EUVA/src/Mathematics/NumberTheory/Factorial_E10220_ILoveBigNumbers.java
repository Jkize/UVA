package Mathematics.NumberTheory;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;  
public class Factorial_E10220_ILoveBigNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String p;
        while ((p = in.readLine()) != null) {
            if (!p.equals("")) {
                BigInteger a = new BigInteger("1");
                for (int i = 2; i <= Integer.parseInt(p); i++) {
                    a = a.multiply(BigInteger.valueOf(i));
                } 
                int sum = 0;
                for (char t : (a.toString()).toCharArray()) {
                        sum += Integer.parseInt("" + t);
                    } 
                out.write(sum + "\n");
            }
                out.flush();
        }
    }
}
