package DataStrucutresAndLibraries.LinearDataStructures;

 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator; 
import java.util.Set;
import java.util.StringJoiner;

/** 
 * @author Jkize
 * Uva 123 Searching Quickly
 */
public class JavaCollections_E00123_SearchingQuickly {
     
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out)); 
        String pa = "";
        HashMap<String, Integer> ignore = new HashMap<>();
        while ((pa=in.readLine())!=null && !pa.equals("::")) { 
            ignore.put(pa.toLowerCase(), 0);
        }
        List<String[]> palabras = new ArrayList<>();
        TreeMap<String, List<int[]>> treemap = new TreeMap<>();
        int i = 0;
        while ((pa=in.readLine())!=null && !pa.equals("")) {
            String pas[] = pa.toLowerCase().split(" ");
            palabras.add(pas);
            for (int j = 0; j < pas.length; j++) {
                if (verifiacion(pas[j], ignore)) {
                    if (treemap.get(pas[j]) == null) {
                        List<int[]> a1 = new ArrayList<>();
                        int a2[] = {i, j};
                        a1.add(a2);
                        treemap.put(pas[j], a1);
                    } else {
                        List<int[]> a1 = treemap.get(pas[j]);
                        int a2[] = {i, j};
                        a1.add(a2);
                    }

                }
            }
            i++;
        }

        /**
         * Iterator recorrer un Treemap
         */
        Set set = treemap.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            List<int[]> a = (List<int[]>) me.getValue();
            for (int j = 0; j < a.size(); j++) {
                int[] a1 = a.get(j);
                String[] pala = palabras.get(a1[0]);
                pala[a1[1]] = pala[a1[1]].toUpperCase();

                StringJoiner h = new StringJoiner(" ");
                for (String s : pala) {
                    h.add(s);
                }
                pala[a1[1]] = pala[a1[1]].toLowerCase();
                out.write(h+"\n");
                out.flush();

            }

        }
        
    }

    public static boolean verifiacion(String b, HashMap<String, Integer> ignore) {
        if (ignore.get(b) == null) {
            return true;
        }
        return false;
    }

}
