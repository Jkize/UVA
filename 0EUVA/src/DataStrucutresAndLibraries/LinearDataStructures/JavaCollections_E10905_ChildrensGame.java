package DataStrucutresAndLibraries.LinearDataStructures;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 
/**
 * Uno muy interesante
 * @author Jkize
 * 
 * Uva 10905 - Children's Game
 */
public class JavaCollections_E10905_ChildrensGame {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String dat;
        while (!(dat = in.readLine()).equals("0")) {
            int sizemayor = -1;
            String a[] = (in.readLine()).split(" ");
            metodo(a);
        }
    }

    private static void metodo(String[] a) {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);        } 
        ordenar(b);

    }

    public static void ordenar(List<String> b) {
        Collections.sort(b, (t, t1) -> {            
             BigInteger big1 = new BigInteger(t+t1);
             BigInteger big2 = new BigInteger(t1+t);                
             return big2.compareTo(big1); 

        });
        String h = "";
        for (int i = 0; i < b.size(); i++) {
            h += b.get(i);
        }
        System.out.println(h);
    }

}
