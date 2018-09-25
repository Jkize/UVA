package Graph.AlllPairsShortestPaths;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
/**
 * 
 * @author Jkize
 * Uva 11015 05-2 Rendezvous
 */
public class Standard_E11015_052Rendezvous {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String da = "";
        int cas = 1;
        while ((da = in.readLine()).charAt(0) != '0') {
            String dat[] = da.split(" ");
            int num_nodos = Integer.parseInt(dat[0]);
            String[] nombres = new String[num_nodos];
            for (int i = 0; i < num_nodos; i++) {
                nombres[i] = in.readLine();
            }
            int num_enlaces = Integer.parseInt(dat[1]);
            int d[][] = new int[num_nodos][num_nodos];
            int pi[][] = new int[num_nodos][num_nodos];
            out.write("Case #" + cas + " : " + nombres[Floy_Warsall(d, pi, num_enlaces, num_nodos, nombres)] + "\n");
            out.flush();
            cas++;
        }

    }

    public static int Floy_Warsall(int d[][], int p[][], int num_enlaces, int num_nodos, String[] nombres) throws IOException {

        for (int i = 0; i < num_nodos; i++) {
            for (int j = 0; j < num_nodos; j++) {
                d[i][j] = (i == j) ? 0 : 99999;
            }
        }

        for (int i = 0; i < num_enlaces; i++) {
            String enlace[] = in.readLine().split(" ");
            d[Integer.parseInt(enlace[0]) - 1][Integer.parseInt(enlace[1]) - 1] = Integer.parseInt(enlace[2]);
            /**
             * <Este significa de que el peso de ir A-B es lo mismo de B-A
             */
            d[Integer.parseInt(enlace[1]) - 1][Integer.parseInt(enlace[0]) - 1] = Integer.parseInt(enlace[2]);
        }

        for (int i = 0; i < num_nodos; i++) {
            for (int j = 0; j < num_nodos; j++) {
                p[i][j] = ((i == j) || (d[i][j] == 99999)) ? 0 : i;
            }
        }
        //List<int[][]> D = new ArrayList<>();
        //D.add(d);
        List<int[][]> pi = new ArrayList<>();
        pi.add(p);
        int d_v2[][] = new int[num_nodos][num_nodos];
        for (int k = 0; k < num_nodos; k++) {
            //int d_v2[][] = D.get(k);
            d_v2 = d;
            int d_k[][] = new int[num_nodos][num_nodos];
            for (int i = 0; i < num_nodos; i++) {
                for (int j = 0; j < num_nodos; j++) {
                    d_k[i][j] = Math.min(d_v2[i][j], d_v2[i][k] + d_v2[k][j]);
                }
            }
            d = d_k;

        }
        int inicial = 0;
        int pos = 0;

        for (int i = 0; i < num_nodos; i++) {
            int acum = 0;
            for (int j = 0; j < num_nodos; j++) {
                if (i == 0) {
                    inicial += d[i][j];
                } else {
                    acum += d[i][j];
                }
            }
            if (i != 0 && inicial > acum) {
                inicial = acum;
                pos = i;
            }

        }
        return pos;
    }

}
