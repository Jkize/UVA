package Mathematics.NumberTheory;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jkize
 * Mishievous Children
 */
public class Factorial_E10338_MishievousChildren {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int cas = Integer.parseInt(in.readLine());
        int n = 1;
        while (cas--!= 0) {
            HashMap<Character, Integer> hash = new HashMap<>();
            char as[] = in.readLine().toCharArray();
            for (char s : as) {
                if (hash.containsKey(s)) {
                    hash.put(s, hash.get(s) + 1);
                } else {
                    hash.put(s, 1);
                }
            } 
            out.write("Data set " + n + ": " + metdf(as.length, hash) + "\n"); 
            n++;

        }
        out.flush();
    }

    public static long fact(int b) {
        long c = 1;
        if (b == 1) {
            return c;
        }
        for (int i = 2; i <= b; i++) {
            c *= i;
        }
        return c;

    }

    public static long metdf(int n, HashMap<Character, Integer> hash) {
        long div = 1;
        long arriba = fact(n);
        Set set=hash.entrySet();
        Iterator it=set.iterator();        
        while(it.hasNext()){
            Map.Entry hs=(Map.Entry)it.next();
              div *= (fact((int)hs.getValue()));
        }  
        return arriba / div;
    }
}
