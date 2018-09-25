/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics.JavaBigIntegerClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Jkize
 * Uva 382 Perfection
 */
public class BonusFeaturesPrimalityTesting_E12542_PrimeSubstring {

    static int[] tableprimos;

    public static void iniciar(int n) {
        tableprimos = new int[n + 1];
        tableprimos[1]=1; 
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
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        iniciar(100000);
        String p;
        int c;
        while ((p = in.readLine()) != null && !p.equals("0")) {
            String n = "0";

            for (int i = 0; i < p.length(); i++) {
                if ((c = tableprimos[Integer.parseInt("" + p.charAt(i))]) == 0 && Integer.parseInt("" + p.charAt(i)) > Integer.parseInt(n)) {
                    n = "" + p.charAt(i);
                }
                String h = "" + p.charAt(i);
                int t;
                if (i != p.length() - 1) {
                    for (int j = i + 1; j < p.length(); j++) {
                        h += p.charAt(j);
                        int cs = Integer.parseInt(h);
                        if (cs < 100000) {
                            if ((t = tableprimos[cs]) == 0 && cs > Integer.parseInt(n)) {
                                n = h;
                            }
                        } else {
                            break;
                        }
                    }
                }

            }
            out.write(Integer.parseInt(n)+ "\n");
        }
        out.flush();

    }
}
