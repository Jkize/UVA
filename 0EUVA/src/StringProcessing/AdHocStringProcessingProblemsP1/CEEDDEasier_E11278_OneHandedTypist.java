/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProcessing.AdHocStringProcessingProblemsP1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/**
 *
 * @author Jkize
 * 
 */
public class CEEDDEasier_E11278_OneHandedTypist {

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Character> convert = new HashMap<>();
        String Qwerty = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>? ";
        String Dvorak = "`123qjlmfp/[]456.orsuyb;=\\789aehtdck-0zx,inwvg'~!@#QJLMFP?{}$%^>ORSUYB:+|&*(AEHTDCK_)ZX<INWVG\" ";
        for(int i=0; i<Qwerty.length(); i++){
            convert.put(Qwerty.charAt(i),Dvorak.charAt(i));
        }
       String h="";
       while((h=in.readLine())!=null){           
            for(char c:h.toCharArray()){
                out.write(convert.get(c));
            }
            out.write("\n");
            out.flush();
       }

    }
}
