package Introduction.GettingStarted;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class SuperEasy_E12250_LanguageDetection {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> mapa=new HashMap<>();
        mapa.put("HELLO", "ENGLISH"); mapa.put("HALLO", "GERMAN");
        mapa.put("BONJOUR", "FRENCH"); mapa.put("CIAO", "ITALIAN");
        mapa.put("ZDRAVSTVUJTE", "RUSSIAN");
        mapa.put("HOLA", "SPANISH");
        
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        String h;
        int n=1;
        while((h=in.readLine())!=null && !h.equals("#")){
            if(mapa.containsKey(h)){
                out.write("Case "+n+": "+mapa.get(h)+"\n");
            }else{
                out.write("Case "+n+": UNKNOWN\n");
            }
            n++;
        }
        out.flush();
    }
}
