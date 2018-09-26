/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics.NumberTheory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Jhoan Saavedra
 */
public class PrimeNumbers_E00686_GoldbachsConjectureII {

    static int[] tableprimos;
    static int res;

    public static void iniciar(int n) {
        tableprimos = new int[n + 1];
        tableprimos[1] = 1;
        int tope = (int) Math.floor(Math.sqrt(n));
        for (int i = 2; i <= tope; i++) {
            if (tableprimos[i] == 0) {
                for (int j = i; j <= n / i; j++) {
                    tableprimos[i * j] = 1;
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        iniciar((int) Math.pow(2, 15));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String p;
        while ((p = in.readLine()) != null && !p.equals("0")) {
            int a = Integer.parseInt(p);
            res = 0;
            prime(a);
            out.write(res + "\n");

        }
        out.flush();
    }

    /**
     * O(n/2)
     * @param p 
     */
    public static void prime(int p) {

        for (int i = 1; i <=Math.floor(p/2); i++) {
            if (tableprimos[i] == 0) {
                int s = p - i; 
                if ((2 * i == p) || (s > i && tableprimos[s] == 0)) {
                    res++;
                }
            }
        }

    }
}
