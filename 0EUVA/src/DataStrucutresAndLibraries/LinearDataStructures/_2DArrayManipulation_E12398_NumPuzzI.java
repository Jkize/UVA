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
import java.util.StringJoiner;

/**
 *
 * @author Jkize
 * Uva 12398 NumPuzzL
 */
public class _2DArrayManipulation_E12398_NumPuzzI {

    public static String ttoString(int matrix[][]) {
        String h = "";
        for (int i = 0; i < 3; i++) {
            StringJoiner h1 = new StringJoiner(" ");
            for (int j = 0; j < 3; j++) {
                h1.add("" + matrix[i][j]);
            }
            h += "\n" + h1.toString();
        }

        return h;
    }

    public static void main(String[] args) throws IOException {
        HashMap<Character, posicion> mapa = new HashMap<>();
        mapa.put('a', new posicion(0, 0));
        mapa.put('d', new posicion(1, 0));
        mapa.put('g', new posicion(2, 0));
        mapa.put('b', new posicion(0, 1));
        mapa.put('e', new posicion(1, 1));
        mapa.put('h', new posicion(2, 1));
        mapa.put('c', new posicion(0, 2));
        mapa.put('f', new posicion(1, 2));
        mapa.put('i', new posicion(2, 2)); 
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String h = "";
        int cas = 1;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));        
        while ((h=in.readLine())!=null) {  
            int matrix[][] = new int[3][3];
            if (!h.equals("")) {
                for (char c : h.toCharArray()) {                  
                        posicion n = mapa.get(c);
                        sumar(matrix, n);                    
                }
                out.write("Case #" + (cas++) + ":" + ttoString(matrix)+"\n");
                out.flush();
            } else {
                out.write("Case #" + (cas++) + ":" + ttoString(matrix)+"\n");
                out.flush();
            }
        }

        
        
    }

    public static void sumar(int[][] matrix, posicion n) {
        int x = n.getX();
        int y = n.getY();
      if(++matrix[x][y]==10) matrix[x][y]=0;        
      if ((y + 1) < 3){
         if(++matrix[x][y+1]==10) matrix[x][y+1]=0;  }  
      
      if ((y - 1) >= 0){
          if(++matrix[x][y-1]==10) matrix[x][y-1]=0;  
      }
      if((x+1)<3){
          if(++matrix[x+1][y]==10) matrix[x+1][y]=0;  
      }
      if((x-1)>=0){
          if(++matrix[x-1][y]==10) matrix[x-1][y]=0;  
      }
    }

    static class posicion {

        private int x;
        private int y;

        public posicion(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }
}
