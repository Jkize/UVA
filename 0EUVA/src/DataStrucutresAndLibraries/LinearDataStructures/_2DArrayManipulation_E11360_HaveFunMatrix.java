package DataStrucutresAndLibraries.LinearDataStructures;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList; 
import java.util.List;

/**
 *
 * @author  Jkize
 *  UVA  11360 Have Fun Matrix
 */
public class _2DArrayManipulation_E11360_HaveFunMatrix{
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int numcas = Integer.parseInt(in.readLine());
        for (int i = 0; i < numcas; i++) {
            List<List> rows = new ArrayList<>();
            int tamanomatrix = Integer.parseInt(in.readLine());
            for (int j = 0; j < tamanomatrix; j++) {
                List<Integer> cols = new ArrayList<>();
                String as[] = in.readLine().split("");
                for (int k = 0; k < as.length; k++) {
                    cols.add(Integer.parseInt(as[k]));
                }
                rows.add(cols);
            }

            int numcambios = Integer.parseInt(in.readLine());

            for (int k = 0; k < numcambios; k++) {
                String cas[] = in.readLine().split(" ");
                int a;
                int b;
                switch (cas[0]) {
                    case "row":
                        a = Integer.parseInt(cas[1]);
                        b = Integer.parseInt(cas[2]);
                        row(rows, a, b);
                        break;
                    case "col":
                        a = Integer.parseInt(cas[1]);
                        b = Integer.parseInt(cas[2]);
                        col(rows, a, b);
                        break;
                    case "inc":
                        inc(rows);
                        break;
                    case "dec":
                        dec(rows);
                        break;
                    case "transpose":
                        transpose(rows);
                        break;
                    default:
                        out.write("Nada\n");
                        out.flush();
                        break;
                }

            }

            out.write("Case #" + (i + 1) + "\n");
            out.flush();
            imprimir(rows);
            out.write("\n");
            out.flush();

        }
    }

    public static void imprimir(List<List> rows) throws IOException {

        for (int i = 0; i < rows.size(); i++) {
            List<Integer> cols = rows.get(i);
            String h = "";
            for (int k = 0; k < cols.size(); k++) {
                h += String.valueOf(cols.get(k));
            }
            out.write(h + "\n");
            out.flush();

        }
    }

    public static void row(List<List> rows, int a, int b) {
        List<List> col = rows.get(a - 1);
        //System.out.println(col.toString());

        rows.set(a - 1, rows.get(b - 1));
        rows.set(b - 1, col);

    }

    public static void col(List<List> rows, int a, int b) {

        for (int i = 0; i < rows.size(); i++) {
            List<Integer> cols = rows.get(i);
            int a_aux = cols.get(a - 1);
            cols.set(a - 1, cols.get(b - 1));
            cols.set(b - 1, a_aux);

        }

    }

    public static void inc(List<List> rows) {
        for (int i = 0; i < rows.size(); i++) {
            List<Integer> col = rows.get(i);
            for (int k = 0; k < col.size(); k++) {
                int n = col.get(k);
                if (n + 1 < 10) {
                    col.set(k, n + 1);
                } else {
                    col.set(k, 0);
                }
            }
        }
    }

    public static void dec(List<List> rows) {
        for (int i = 0; i < rows.size(); i++) {
            List<Integer> col = rows.get(i);
            for (int k = 0; k < col.size(); k++) {
                int n = col.get(k);
                if (n - 1 >= 0) {
                    col.set(k, n - 1);
                } else {
                    col.set(k, 9);
                }
            }
        }

    }

    public static void transpose(List<List> rows) {
        List<List> rows_nuevo = new ArrayList<>();
        for (int i = 0; i < rows.size(); i++) {
            List<Integer> cols_nuevo = new ArrayList<>();
            for (int j = 0; j < rows.size(); j++) {
                List<Integer> cols = rows.get(j);
                cols_nuevo.add(cols.get(i));
            }
            rows_nuevo.add(cols_nuevo);
        }
        for (int i = 0; i < rows_nuevo.size(); i++) {
            rows.set(i, rows_nuevo.get(i));
        }

    }

}
