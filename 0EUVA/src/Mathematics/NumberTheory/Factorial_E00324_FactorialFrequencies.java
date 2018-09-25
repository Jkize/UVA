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
import java.math.BigInteger;
import java.util.HashMap; 
/**
 *
 * @author Jkize
 * Factorial Frequencies
 */
public class Factorial_E00324_FactorialFrequencies {
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String h;
        while ((h = in.readLine()) != null && !h.equals("0")) {
            HashMap<String, Integer> dat = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                dat.put(String.valueOf(i), 0);
            }
            BigInteger a = new BigInteger("1");
            for (int i = 1; i <= Integer.parseInt(h); i++) {
                a = a.multiply(BigInteger.valueOf(i));
            } 

            for (String d : (a.toString()).split("")) {
                dat.put(d, dat.get(d) + 1);
            }
            out.write(h + "! --\n");
            for (int i = 0; i <= 4; i++) {
                String t = "(" + i + ")";
                if(i!=0)
                out.write(String.format("%7s%5d", t, dat.get(String.valueOf(i))));
                else
                       out.write(String.format("%6s%5d", t, dat.get(String.valueOf(i))));
            }
            out.write("\n");
            for (int i = 5; i <= 9; i++) {
                String t = "(" + i + ")";
                if(i!=5)
                out.write(String.format("%7s%5d", t, dat.get(String.valueOf(i))));
                else
                     out.write(String.format("%6s%5d", t, dat.get(String.valueOf(i))));
            }
            out.write("\n");
        }
        out.flush();

    }
}
