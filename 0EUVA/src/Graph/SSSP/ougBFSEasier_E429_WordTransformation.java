/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.SSSP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class ougBFSEasier_E429_WordTransformation {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int cas = Integer.parseInt(in.readLine());
        String s = in.readLine();
  
        while (cas-- != 0) {
            String h;
            Graph grafo = new Graph(); 
            int n = 1;
            while ((h = in.readLine()) != null && !(h.trim()).equals("*")) {
                grafo.add(h.trim()); 
            }
            while ((h = in.readLine()) != null && !(h.trim()).equals("")) {
                String palabras[] = (h.trim()).split(" ");
                String inicial = palabras[0];
                String fin = palabras[1];

                if (inicial.equals(fin)) {
                    out.write(inicial + " " + fin + " 0\n");
                } else {
                   HashMap<String,Integer>mapa=grafo.mapa(inicial);  
                   boolean visitado[]=new boolean[grafo.tamano(inicial)]; 
                   visitado[mapa.get(inicial)]=true;                   
                    HashMap<String, Integer> table = new HashMap<>();
                    Queue<String> cola = new LinkedList<>();
                    
                    cola.add(inicial);
                    table.put(inicial, 0);
                    bfs(mapa, visitado, table, cola, fin);
                    out.write(inicial + " " + fin + " " + table.get(fin) + "\n");

                }

            }
            if(cas!=0)
            out.write("\n");
        }
        out.flush();

    }

    public static boolean coincidencia(String h, String n) {
        int num = 0;
        for (int i = 0; i < h.length(); i++) {
            if (h.charAt(i) == n.charAt(i)) {
                num++;
            }
        }
        if (num == h.length() - 1) {
            return true;
        }

        return false;
    }

    public static void bfs(HashMap<String, Integer> datos, boolean a[], HashMap<String, Integer> table, Queue<String> cola, String fin) {

        while (!cola.isEmpty()) {
            String h = cola.poll();
            for (Map.Entry<String, Integer> entry : datos.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (!a[value] && coincidencia(h, key)) {
                    cola.add(key); 
                    a[value] = true;
                    table.put(key, table.get(h) + 1);
                    if (key.equals(fin)) {
                        break;
                    }
                }

            }

        }

    }

    static class Graph {

        private int V;
        private ArrayList<String> ady[];
        private HashMap<String,Integer>mapa;

        public Graph() {
            ady = new ArrayList[10];
            for (int i = 0; i < ady.length; i++) {
                ady[i] = new ArrayList<>();
            }

        }

        public void add(String h) {
            ady[h.length()-1].add(h); 
        }
 
        public HashMap<String,Integer> mapa(String h){ 
            HashMap<String,Integer> mapa=new HashMap<>();
            for(int i=0; i<tamano(h); i++){ 
                mapa.put(ady[h.length()-1].get(i),i);
            }
            return mapa;
        }
        public int tamano(String h){
            return (ady[h.length()-1]).size();
        }
    }

}
