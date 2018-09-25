/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics.AdHocMathematicsProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author ACER
 */
public class FindingPatternorFormulaHarder_E10161_AntOnAChessboard {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
       
        String dat = "";
        while ((dat = in.readLine()) != null && !dat.equals("0")) {
            double dato = Double.parseDouble(dat);
            String comienzo = "";
            String tipo = "";
            double r = Math.sqrt(dato);
            double r1 = Math.round(r);
            comienzo = ((int)r == r1) ? "down" : "up";
            tipo = (r1 % 2 == 0) ? "par" : "impar";
            out.write(metodoxd(dato, tipo, comienzo, r1) + "\n");         
        }
           out.flush();
    }
    public static String metodoxd(double dato, String tipo, String comienzo, double r1) {
           double comp=Math.pow(r1, 2);
           double res=0; 
        if (tipo.equals("par")) {         
            if (comp == dato)return (String.valueOf((int)r1) + " 1");
              res=dato-comp;
            if (comienzo.equals("down")) {     
                return (String.valueOf( (int)  r1+1) +" "+String.valueOf((int)res));
            } else { 
                return(String.valueOf((int)r1)+" "+String.valueOf((int)-res+1));
            }
        } else {
            if (Math.pow(r1, 2) == dato)return ("1 " + String.valueOf((int)r1));
            res=dato-comp;
            if (comienzo.equals("down")) {
                return (String.valueOf((int)res)+" "+String.valueOf((int)r1+1));

            } else {
                return (String.valueOf((int)-res+1)+" "+String.valueOf((int)r1));
            }

        }

    }
}
