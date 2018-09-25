package DataStrucutresAndLibraries.LinearDataStructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Jkize
 * Uva 11039 Building Design
 */

public class JavaCollections_E11039_BuildingDesign {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int cas = Integer.parseInt(in.readLine());
        while (cas != 0) {
            cas--;
            int floor = Integer.parseInt(in.readLine());
            List<List> pisos = new ArrayList<>();
            for (int i = 0; i < floor; i++) {
                int n = Integer.parseInt(in.readLine());
                List<Object> azul_rojo = new ArrayList<>();
                boolean t = (n > 0) ? false : true;
                azul_rojo.add(Math.abs(n));
                azul_rojo.add(t);
                pisos.add(azul_rojo);
            }
            Collections.sort(pisos, (t, t1) -> {
                Integer n1 = (int) t.get(0);
                Integer n2 = (int) t1.get(0);
                return n1.compareTo(n2);
            });
            out.write(total(pisos) + "\n");
        }
        out.flush();
    }

    public static int total(List<List> pisos) {
        int total = 0;
        if (pisos.size() > 0) {
            boolean inicialpiso = (boolean) (pisos.get(0)).get(1);
            int sizeinicial = (int) (pisos.get(0)).get(0);
            total++;
            for (int i = 1; i < pisos.size(); i++) {
                if (inicialpiso != (boolean) ((pisos.get(i)).get(1)) && sizeinicial < (int) (pisos.get(i)).get(0)) {
                    total++;
                    inicialpiso = (boolean) (pisos.get(i)).get(1);
                    sizeinicial = (int) (pisos.get(i)).get(0);

                }

            }
        }

        return total;
    }

}
