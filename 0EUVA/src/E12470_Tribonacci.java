 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;


/**
 *
 * @author Jkize
 * 12470 Tribonacci
 */

public class E12470_Tribonacci {

    static final int mod = 1000000009;
    static final int f0[] = {0, 1, 2};
    static long R[][];

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String h;
        int k = 3; //Constante k
        long f[][] = new long[k][1];
        long M[][] = new long[k][k];
        iniciar(f, M, k); 
        while ((h = in.readLine()) != null && !h.equals("0")) {

            String nth = h; //nth termino de la sucección
            BigInteger n = new BigInteger(nth);
            if (n.compareTo(new BigInteger(String.valueOf(k))) <= 0) {
                out.write(f0[Integer.parseInt(n.toString()) - 1] + "\n");
               
            } else {
                BigInteger sa = new BigInteger("3");
                out.write(multiplicacion(power_iter(M, n.subtract(sa)), f)[0][0] + "\n");
                
            }
        } 
        out.flush();

    }

    public static void iniciar(long f[][], long M[][], int k) {
        R = new long[M.length][M.length];
        for (int i = 0; i < k; i++) {
            f[i][0] = f0[(k - 1) - i];
            R[i][i] = 1;
        }
        int col = 0;
        for (int i = 0; i < k; i++) {
            M[0][i] = 1;
            if (i > 0) {
                M[i][col] = 1;
                col++;
            }

        }
    }

    public static long[][] multiplicacion(long M[][], long M2[][]) {

        long res[][] = new long[M.length][M2[0].length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M2[0].length; j++) {
                long sum = 0;
                for (int k = 0; k < M[0].length; k++) {
                    sum =  (sum+M[i][k] * M2[k][j]) % mod;
                }
                res[i][j] = sum;
            }
        }

        return res;
    }

    public static long[][] power_iter(long M[][], BigInteger n) {
        long result[][] = R.clone();
        while (n.compareTo(BigInteger.ZERO) > 0) {
            if (n.mod(new BigInteger("2")) != BigInteger.ZERO) {
                result = multiplicacion(result, M);
                n = n.subtract(BigInteger.ONE);
            } else {
                M = multiplicacion(M, M);
                n = n.divide(new BigInteger("2"));
            }
        }
        return result;
    }
}
