/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStrucutresAndLibraries.NonLinearDataStructures;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue; 
import java.util.Stack;
/**
 *
 * @author ACER
 */
public class JavaPriorityQueue_E11995_IcanGuess {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String dat = "";
        while ((dat=in.readLine())!=null && !dat.equals("")) { 
            int n1[] = new int[Integer.parseInt(dat)];
            int n2[] = new int[Integer.parseInt(dat)];
            for(int i=0; i<Integer.parseInt(dat); i++){ 
                String cs[]=in.readLine().split(" ");
                n1[i] =Integer.parseInt(cs[0]) ;
                n2[i] = Integer.parseInt(cs[1]);                
            }
            boolean probar[] = {stack(n1, n2), cola(n1, n2), priority(n1, n2)};            
            out.write(tipo(probar) + "\n");
        }
        out.flush();
    }

    public static boolean stack(int[] n1, int[] n2) {
        Stack<Integer> c = new Stack<>();
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] == 2) {
                if (!c.empty()) {
                    if (n2[i] != c.pop()) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                c.push(n2[i]);
            }
        }
        return true;
    }

    public static boolean cola(int[] n1, int[] n2) {
        Queue<Integer> c = new LinkedList<>();
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] == 2) {
                if (!c.isEmpty()) {
                    if (n2[i] != c.remove()) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                c.add(n2[i]);
            }
        }
        return true;
    }

    public static boolean priority(int[] n1, int[] n2) {
        PriorityQueue<Integer> c = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] == 2) {
                if (!c.isEmpty()) {
                    if (n2[i] != c.remove()) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                c.add(n2[i]);
            }
        }
        return true;

    }

    public static String tipo(boolean[] probar) {

        int totaltrue = 0;
        int pos = 0;
        for (int i = 0; i < probar.length; i++) {
            if (probar[i]) {
                pos = i;
                totaltrue++;
            }
        }

        if (totaltrue == 0) {
            return "impossible";
        } else {
            if (totaltrue > 1) {
                return "not sure";
            } else { 
                if (pos == 0) {
                    return "stack";
                }
                if (pos == 1) {
                    return "queue";
                } else {
                    return "priority queue";
                }

            }
        }

    }
}
