/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics.Combinatorics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 *
 * @author Jhoan Saavedra
 */
public class Fibonacci_E10579_FibonacciNumbers {

    static final String f0[] = {"0", "1", "1"};
    static BigInteger R[][];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String h;

        R = new BigInteger[2][2];
        R[0][0] = BigInteger.ONE;
        R[0][1] = BigInteger.ZERO;
        R[1][0] = BigInteger.ZERO;
        R[1][1] = BigInteger.ONE;

        BigInteger f[][] = new BigInteger[2][1];
        f[0][0] = BigInteger.ONE;
        f[1][0] = BigInteger.ONE;
        //Si pongo f[1][0]=0; entonces al elevarlo le resto -1 al nth numero a hayar , si lo pongo como 1 entonces le resto 2.

        BigInteger M[][] = new BigInteger[2][2];
        M[0][0] = BigInteger.ONE;
        M[0][1] = BigInteger.ONE;
        M[1][0] = BigInteger.ONE;
        M[1][1] = BigInteger.ZERO;

        while ((h = in.readLine()) != null) {
            int n = Integer.parseInt(h);
            if (n <= 2) {
                out.write(f0[n].toString() + "\n");
            } else {
                out.write((multiplicacion(power_iter(M, n - 2), f)[0][0]).toString() + "\n");
            }

        }

        out.flush();
    }

    public static BigInteger[][] multiplicacion(BigInteger M[][], BigInteger M2[][]) {

        BigInteger res[][] = new BigInteger[M.length][M2[0].length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M2[0].length; j++) {
                BigInteger sum = BigInteger.ZERO;
                for (int k = 0; k < M[0].length; k++) {

                    sum = sum.add((M[i][k]).multiply(M2[k][j]));

                }
                res[i][j] = sum;
            }
        }

        return res;
    }

    public static BigInteger[][] power_iter(BigInteger M[][], int n) {
        BigInteger result[][] = R.clone();
        while (n > 0) {
            if (n % 2 != 0) {
                result = multiplicacion(result, M);
                n -= 1;
            } else {
                M = multiplicacion(M, M);
                n /= 2;
            }
        }
        return result;
    }
}
