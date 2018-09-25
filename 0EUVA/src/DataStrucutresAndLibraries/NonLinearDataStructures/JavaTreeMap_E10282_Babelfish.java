package DataStrucutresAndLibraries.NonLinearDataStructures;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap; 
/**
 *
 * @author JhoSeSaRo
 */
public class JavaTreeMap_E10282_Babelfish {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String> map = new HashMap<>();
        String h;
        while ((h = in.readLine()) != null && !h.equals("")) {
            String s[] = h.split(" ");
            map.put(s[1], s[0]);
        } 
        while ((h = in.readLine()) != null ) {
            if (map.containsKey(h)) {
                out.write(map.get(h) + "\n");
            }else{
                out.write("eh\n");
            }
             out.flush();
        }  
       
    }
}
