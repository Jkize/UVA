 
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
 * Uva 10039 Jolly Jumpers
 */
public class _1DArrayManipulation_E10038_JollyJumpers {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        String h="";
        while((h=in.readLine())!=null){
            String hh[]=h.split(" ");
            if(jolly(hh)){
                out.write("Jolly\n");
                out.flush();
            }else{
                out.write("Not jolly\n");
                out.flush();
            }                
        }
    }

    public static boolean jolly(String[] hh) {
        int inicial=Integer.parseInt(hh[0]);
        List<Integer>a=new ArrayList<>();
        for(int i=1; i<hh.length-1; i++){
        a.add(Math.abs(Integer.parseInt(hh[i])-Integer.parseInt(hh[i+1])));
        }
        Collections.sort(a,Collections.reverseOrder()); 
        for(int i=0; i<a.size(); i++){
            if(--inicial!=a.get(i))return false;
        }
        return true;
    }
}
