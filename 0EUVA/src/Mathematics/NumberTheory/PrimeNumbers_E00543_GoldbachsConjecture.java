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
 * @author Jkize
 * 543 Goldbach's Conjecture
 */
public class PrimeNumbers_E00543_GoldbachsConjecture {

   static int[] tableprimos;

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
        iniciar(1000000); 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String p;
        while ((p = in.readLine()) != null && !p.equals("0")) {
            int a = Integer.parseInt(p);

            int n = prime(a);
            if (n != 0) {
                out.write(a + " = " + n + " + " + (a - n) + "\n");
            } else {
                out.write(a + " = 0 + " + a + "\n");
            }

        }
        out.flush();
    } 
    public static int prime(int p) {

        for (int i = 3; i <=Math.floor(p/2); i++) {
            if (tableprimos[i]==0) {
                int s = p - i;
                if (tableprimos[s]==0) {
                    return i;
                }
            }
        }

        return 0;
    }
}
