package DataStrucutresAndLibraries.NonLinearDataStructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator; 
import java.util.Map;
import java.util.Set; 
import java.util.TreeMap;
 /**
  * 
  * @author Jhoan Sebastian Saavedra Romero
  * cc: 1010238118; since: 03-04-2018
  */
public class JavaTreeMap_E10226_HardwoodSpecies {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int cas = Integer.parseInt(in.readLine());
        String t = in.readLine();
        if (t.equals("")) {
            while (cas-- != 0) {
                TreeMap<String, Integer> arboles = new TreeMap<>();
                int pblacion = 0;
                String h = "";
                while ((h = in.readLine()) != null && !h.equals("")) {
                    pblacion++;
                    if (arboles.containsKey(h)) {
                        arboles.put(h, arboles.get(h) + 1);
                    } else {
                        arboles.put(h, 1);
                    }
                }

                Set set = arboles.entrySet();
                Iterator it = set.iterator(); 
                while (it.hasNext()) {
                    Map.Entry me = (Map.Entry) it.next(); 
                    out.write(String.format("%s %.4f\n", (String) me.getKey(), (double) (100 * (int) me.getValue()) / pblacion));

                }
                if(cas!=0)out.write("\n");

            }
        }
        out.flush();
    }
}
