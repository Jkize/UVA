package Mathematics.Combinatorics;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

 
/**
 *
 * @author Jkize
 * Uva 485 Pascal's Triangle of Death
 */
public class BinomialCoefficients_E00485_PascalsTriangleofDeath {

    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        out.write("1" + "\n" + "1 1" + "\n");
        BigInteger cs=new BigInteger("10");
        cs=cs.pow(60); 
        List<BigInteger> a = new ArrayList<>();
       
        a.add(new BigInteger("1"));
        a.add(new BigInteger("1"));
        boolean t = false;
        while (!t) { 
             List<BigInteger> b = new ArrayList<>();
            StringJoiner joiner = new StringJoiner(" ");
            b.add(new BigInteger("1"));
            joiner.add("1");
            for (int i = 0; i < a.size() - 1; i++) {  
                BigInteger d=a.get(i).add(a.get(i+1)); 
                if(d.compareTo(cs)!=-1)t=true;          
                joiner.add(d.toString());
                b.add(d);             
                
            }
            joiner.add("1");
            b.add(new BigInteger("1"));
            a=b; 
            out.write(joiner.toString()+"\n");          
        }
          out.flush();
        
    }
}
