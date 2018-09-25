/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics.JavaBigIntegerClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Jkize
 */
public class BonusFeaturesPrimalityTesting_E10924_PrimeWords {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String p = "";
        while ((p = in.readLine()) != null ) {
            int c = 0;
            if (p.length() > 0) {
                for (char d : p.toCharArray()) {
                    if (d >= 'A' && d <= 'Z') {
                        c += (d - 38);
                    } else {
                        c += (d - 96);
                    }
                }
                out.write(isprime(c) + "\n");
                
                
            }
        } 
        out.flush();
        in.close();
        out.close();
    }

    public static String isprime(int c) {
        boolean t = true;
        for (int i = 2; i < c; i++) {
            if (c % i == 0) {
                t = false;

                break;
            }
        }

        if (t) {
            return "It is a prime word.";
        } else {
            return "It is not a prime word.";
        }

    }

}
