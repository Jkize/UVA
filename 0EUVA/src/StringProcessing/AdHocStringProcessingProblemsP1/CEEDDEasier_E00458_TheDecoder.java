/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProcessing.AdHocStringProcessingProblemsP1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class CEEDDEasier_E00458_TheDecoder {

    /**
     * No me lo quiso aceptar de esa forma ni idea
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        while (in.hasNextLine()) {
            String t = in.nextLine();
            for (char c : t.toCharArray()) {
                char tt = (char) (c -7);
                out.write(tt);
            }
           out.write("\n"); out.flush();
        }
    }
    
    /*
    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);
        int s;
        while ((s = in.read()) != -1) {
            if (s == 10) {
                out.writeByte(10);
            } else {
                out.writeByte(s - 7);
            }
            out.flush();
        }
    }
    */
    
}
