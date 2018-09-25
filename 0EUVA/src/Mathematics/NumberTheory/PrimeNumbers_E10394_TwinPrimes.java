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

/**
 *
 * @author Jkize
 * 10394 Twin Primes
 */
public class PrimeNumbers_E10394_TwinPrimes {

    static int pares[] = new int[100000];
    static int tableprimos[] = new int[20000000];
    public static void inici() {
        for (int i = 2; i < Math.sqrt(20000000); i++) {
            if (tableprimos[i] == 0) {
                for (int j = 2; j < (20000000/ i); j++) {
                    tableprimos[i * j] = 1;
                }
            }

        }
        int x = 0;
        for (int i = 3; i < tableprimos.length - 2; i++) {
            
            if(tableprimos[i]==0 && tableprimos[i+2]==0){
                pares[x++]=i;
            }
            if(x==100000) break;

        }

    }

    public static void main(String[] args) throws IOException {
        inici();
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       String p;
       while((p=in.readLine())!=null){
           int n=pares[Integer.parseInt(p)-1];
           out.write(String.format("(%d, %d)\n",n,n+2));
           out.flush();
           
       }
    }
}
