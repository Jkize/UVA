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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author ACER
 */
public class WorkingWithPrimeFactor_E160_FactorsandFactorials {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String p;
        while ((p = in.readLine()) != null && !p.equals("0")) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            BigInteger a = new BigInteger("1");
            for (int i = 1; i <= Integer.parseInt(p); i++) {
                a = a.multiply(BigInteger.valueOf(i));
            }
            int inicial = 2;
            while (a.compareTo(new BigInteger("1")) != 0) {
                if ((a.mod(BigInteger.valueOf(inicial))).compareTo(new BigInteger("0")) == 0) {
                    a = a.divide(BigInteger.valueOf(inicial));
                    if (map.containsKey(inicial)) {
                        map.put(inicial, map.get(inicial) + 1);
                    } else {
                        map.put(inicial, 1);
                    }

                } else {
                    inicial++;
                }
            }

            Set set = map.entrySet();
            Iterator it = set.iterator();
            out.write(String.format("%3s! =", p));
            int cont = 0;
            while (it.hasNext()) {

                Map.Entry me = (Map.Entry) it.next();
                if (cont != 15) {
                    out.write(String.format("%3d", me.getValue()));
                    cont++;
                } else {
                    if (cont % 15 == 0) {
                        out.write(String.format("\n%9d", me.getValue()));
                        cont++;
                    }
                }
            }
            out.write("\n");

        }
        out.flush();
    }
}
