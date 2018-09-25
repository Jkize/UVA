package Mathematics.NumberTheory;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
/**
 * 
 * @author Jkize
 * 11827 Maximum GCD uva
 */
public class GCDandorLCM_E11827_MaximumGCD {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int cas = Integer.parseInt(in.readLine());
        while (cas-- != 0) {
            String h[] = in.readLine().split(" ");
            int n = 1;
            for (int i = 0; i < h.length - 1; i++) {
                for (int j = i + 1; j < h.length; j++) {
                    int c= gcd(Integer.parseInt(h[i]), Integer.parseInt(h[j]));
                    if(c>n){
                        n=c;}                
                    
                }
            }
            out.write(n + "\n");

        }
        out.flush();

    }
    
    public static int gcd(int p,int q){
        if(q==0)return p;
        int r=p%q;
        return gcd(q,r);
    }
}
