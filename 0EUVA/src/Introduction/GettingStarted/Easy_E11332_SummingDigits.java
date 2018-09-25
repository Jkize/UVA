/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction.GettingStarted;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author ACER
 */
public class Easy_E11332_SummingDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=0;
        while((n=Integer.parseInt(in.readLine()))!=0){
           out.write(num(n)+"\n");
          
        }
         out.flush();
        }
      
    public static int num(int n){
        if(n<10){
            return n;
        }
        String p=String.valueOf(n);
        int c=0;
        for(int i=0; i<p.length(); i++){
            c+=Integer.parseInt(""+p.charAt(i));
        }
        return num(c);
        
    }
}

