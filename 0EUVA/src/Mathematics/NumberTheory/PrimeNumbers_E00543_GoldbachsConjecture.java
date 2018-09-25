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

    static int tableprimos[] = new int[1010001]; 
    public static void inici() {
        for (int i = 2; i <Math.sqrt(1010001); i++) {
            if (tableprimos[i] == 0) { 
                for (int j = 2; j <(1010001/ i); j++) {
                    tableprimos[i * j] = 1;
                }
            }

        }

    }

    public static void main(String[] args) throws IOException {
        inici(); 
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

        for (int i = 3; i < p; i++) {
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
