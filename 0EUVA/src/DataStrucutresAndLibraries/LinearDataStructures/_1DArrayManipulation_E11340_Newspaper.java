/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStrucutresAndLibraries.LinearDataStructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/**
 *
 * @author Jkize
 * Uva 11340 Newspaper
 */
public class _1DArrayManipulation_E11340_Newspaper {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));   
        BufferedWriter out =new BufferedWriter(new OutputStreamWriter(System.out));
        int test=Integer.parseInt(in.readLine());
        while(test--!=0){
            int lets=Integer.parseInt(in.readLine());
            HashMap<Character,Integer> pago=new HashMap<>();
            while(lets--!=0){
                String c[]=in.readLine().split(" ");
                pago.put(c[0].charAt(0), Integer.parseInt(c[1]));
            }
            lets=Integer.parseInt(in.readLine());
            double pagar=0;
            while(lets--!=0){
                String palabras=in.readLine();
                for(char a:palabras.toCharArray()){
                    if(pago.get(a)!=null){
                        pagar+=pago.get(a);
                    }
                }
            }
         out.write(String.format("%.2f$\n", (pagar/100)));
        }
        out.flush();
    }
}
