package DataStrucutresAndLibraries.LinearDataStructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

 /**
  * 
  * @author Jkize
  * Uva 11321 Sort! Sort!! and Sort!!!
  */
public class JavaCollections_E11321_SortSortAndSort {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String h = "";
        while (!(h = in.readLine()).equals("0 0")) {

            String datos[] = h.split(" ");
            int n = Integer.parseInt(datos[0]);
            int mod = Integer.parseInt(datos[1]);
            int res = 0;
            TreeMap<Integer, List<Integer>> treemap = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int nn = Integer.parseInt(in.readLine());
                res = nn % mod;
                if (treemap.get(res) == null) {
                    List<Integer> parimpar = new ArrayList<>();
                    parimpar.add(nn);
                    treemap.put(res, parimpar);
                } else {
                    List<Integer> parimpar = treemap.get(res);
                    parimpar.add(nn);
                }
            }

            System.out.println(datos[0] + " " + datos[1]);
            Set set = treemap.entrySet();
            Iterator it = set.iterator();

            while (it.hasNext()) {
                Map.Entry me = (Map.Entry) it.next();
                List<Integer> a = (List<Integer>) me.getValue();
                Collections.sort(a, (o1, o2) -> {
                    if (o1 % 2 != 0 && o2 % 2 != 0) {
                        return o2.compareTo(o1);
                    }
                    if (o1 % 2 == 0 && o2 % 2 != 0) {
                        return 1;
                    }
                    if (o1 % 2 != 0 && o2 % 2 == 0) {
                        return -1;
                    }
                    return o1.compareTo(o2);
                });

                for (int j = 0; j < a.size(); j++) {
                    out.write(a.get(j) + "\n");
                    out.flush();
                }
            }
        }
        out.write("0 0\n");
        out.flush();
    }

}
