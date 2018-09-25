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
import java.util.Scanner;

/**
 *UVa 00272 - TEX Quotes
 * @author ACER
 */
public class SuperEasy_E00272_TEXQuotes {
    
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        String dat="";       
        int cont=0;
        while (in.hasNextLine()) {
            dat= in.nextLine();
            if (dat.equals("")) {
                break;
            }
          String res="";
          for(int i=0; i<dat.length(); i++){
              if(dat.charAt(i)=='"'){
                  if(cont==0){
                      res+="``";
                      cont=1;
                  }else{
                     res+="''";
                     cont=0;
                  }
              }else{
                  res+=""+dat.charAt(i);
              }
          }           
          out.write(res+"\n");
          
        }
        out.flush();
        
    }
    
}


