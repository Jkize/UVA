/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStrucutresAndLibraries.NonLinearDataStructures;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
import java.util.TreeSet;

/**
 * Andy's First Dictionary.
 * Hice el mio casi exactamente igual y me envio 4 veces PE.
 * @author Izhari Ishak Aksa
 */
public class JavaTreeSet_E10815_AndyFirstDictionary {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter pw=new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        TreeSet<String> set = new TreeSet<String>();
        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            char[] c = line.toCharArray();
            for (int i = 0; i < line.length(); i++) {
                if ((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) {
                    sb.append(c[i]);
                } else if (sb.length() > 0) {
                    set.add(sb.toString().toLowerCase());
                    sb = new StringBuilder();
                }
            }
            if (sb.length() > 0) {
                set.add(sb.toString().toLowerCase());
            }
        }
        
        for (String s : set) {
            pw.write(s+"\n");
        }
        pw.flush();
        pw.close();
        br.close();
    }
}