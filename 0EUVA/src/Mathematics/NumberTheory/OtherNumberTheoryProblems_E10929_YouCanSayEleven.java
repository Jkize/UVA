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
 *
 * @author Jkize
 * 10929 You Can Say Eleven
 */
public class OtherNumberTheoryProblems_E10929_YouCanSayEleven {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String h;        
        while((h=in.readLine())!=null && !h.equals("0")){
            String d=h.trim();
            BigInteger a=new BigInteger(d);
            if((a.mod(BigInteger.valueOf(11))).equals(BigInteger.ZERO)) {
                out.write(d+" is a multiple of 11.\n");
            }else{
                out.write(d+" is not a multiple of 11.\n");
            }
        }
        out.flush();
    }
 
}
