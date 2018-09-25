package DataStrucutresAndLibraries.LinearDataStructures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Jkize
 * Uva 11588 Image Coding
 */
public class JavaCollections_E11588_ImageCoding {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int cas = Integer.parseInt(in.readLine());
        for (int i = 1; i <= cas; i++) {
            HashMap<String, Integer> a = new HashMap<>();
            List<xd> clase = new ArrayList<>();
            String datos[] = (in.readLine()).split(" ");
            int n = 0;
            for (int j = 0; j < Integer.parseInt(datos[0]); j++) {
                String dat2[] = (in.readLine()).split("");
                for (int k = 0; k < Integer.parseInt(datos[1]); k++) {
                    if (a.get(dat2[k]) == null) {
                        clase.add(new xd(1, dat2[k]));
                        a.put(dat2[k], n);
                        n++;
                    } else {
                        xd joo = clase.get(a.get(dat2[k]));
                        int val = joo.getValor();
                        joo.setValor(val + 1);
                    }
                }
            }
            Collections.sort(clase, (t, t1) -> {
                return ((Integer) t1.getValor()).compareTo((Integer) t.getValor());
            });
            int maxval = ((xd) clase.get(0)).getValor();
            int max = maxval;
            int menor = 0;
            for (int k = 1; k < clase.size(); k++) {
                if (maxval == clase.get(k).getValor()) {
                    max += maxval;
                } else {
                    menor += clase.get(k).getValor();
                }
            }
            int total = max * Integer.parseInt(datos[2]) + menor * Integer.parseInt(datos[3]);
            System.out.printf("Case %d: %d\n", i, total);

        }

    }

    static class xd {

        private int valor;
        private String nombre;

        public xd(int valor, String nombre) {
            this.valor = valor;
            this.nombre = nombre;

        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    }

}
