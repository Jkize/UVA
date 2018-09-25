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
/**
 *@author Jhoan Saavedra
 * 500! Factorial
 */
  
public class Factorial_E00623_500Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger arreglo[]=new BigInteger[1002];
        arreglo[0]=new BigInteger("1");
        for(int i=1; i<=1000; i++){  
            arreglo[i]=arreglo[i-1].multiply(BigInteger.valueOf(i));
        }
        String p="";
         while((p=in.readLine())!=null){ 
            out.write(p+"!\n"+arreglo[Integer.parseInt(p)].toString()+"\n");
            
            out.flush(); 
        }
    }
}
