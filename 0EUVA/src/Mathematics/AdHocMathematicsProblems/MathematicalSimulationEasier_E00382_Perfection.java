package Mathematics.AdHocMathematicsProblems;

 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
import java.util.Scanner;

public class MathematicalSimulationEasier_E00382_Perfection {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println(Long.MAX_VALUE);
        System.out.println("2432902008176640000");
        out.write("PERFECTION OUTPUT\n");
        while (in.hasNext()) {
            int as = in.nextInt();
            if (as != 0) {
                out.write(String.format("%5d  %s\n", as, eldat(as)));
            } else {
                out.write("END OF OUTPUT\n");
                out.flush();
                break;
            }
        }
    }

    public static String eldat(int as) {
        int cont = 1;
        for (int k = as / 2; k >= 2; k--) {
            if (as % k == 0) {
                cont += k;
            }
            if (cont > as) {
                break;
            }
        }
        String t = "";
        if (as == cont && as != 1) {
            t = "PERFECT";
        } else {
            if (cont > as) {
                t = "ABUNDANT";
            } else {
                t = "DEFICIENT";
            }
        }
        return t;
    }

}
