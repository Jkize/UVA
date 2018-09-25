 
import java.io.IOException; 
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhoan Saavedra
 */
public class fibonacci_kth_nth {
    static final int mod = 1000000009;
    static final int f0[] = {1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 73741815, 147483630, 294967260, 589934520, 179869031, 359738062, 719476124, 438952239, 877904478, 755808947, 511617885, 23235761, 46471522, 92943044, 185886088, 371772176, 743544352, 487088695, 974177390, 948354771, 896709533, 793419057, 586838105, 173676201, 347352402, 694704804, 389409599, 778819198, 557638387, 115276765, 230553530, 461107060, 922214120, 844428231, 688856453, 377712897, 755425794, 510851579, 21703149, 43406298, 86812596, 173625192, 347250384, 694500768, 389001527, 778003054, 556006099, 112012189, 224024378, 448048756, 896097512, 792195015, 584390021, 168780033, 337560066, 675120132, 350240255, 700480510, 400961011, 801922022, 603844035, 207688061, 415376122, 830752244, 661504479, 323008949, 646017898, 292035787, 584071574};
    static long R[][];

    public static void main(String[] args) throws IOException {
        int k = 7; //Constante k
        String nth = "10"; //nth termino de la sucección
        
        BigInteger n = new BigInteger(nth);
        if (n.compareTo(new BigInteger(String.valueOf(k))) <= 0) {
            System.out.println(f0[Integer.parseInt(n.toString())]);
        } else {
            long f[][] = new long[k][1];
            long M[][] = new long[k][k];
            iniciar(f, M, k);
            BigInteger sa = (new BigInteger(String.valueOf(k))).subtract(BigInteger.ONE);

            System.out.println(multiplicacion(power_iter(M, n.subtract(sa)), f)[0][0]);
        }

    }

    public static void iniciar(long f[][], long M[][], int k) {
        R = new long[M.length][M.length];
        for (int i = 0; i < k; i++) {
            f[i][0] = f0[(k - 1) - i];
            R[i][i] = 1;
        }
        int col = 0;
        for (int i = 0; i < k; i++) {
            M[0][i] = 1;
            if (i > 0) {
                M[i][col] = 1;
                col++;
            }

        }
    }

    public static long[][] multiplicacion(long M[][], long M2[][]) {

        long res[][] = new long[M.length][M2[0].length];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M2[0].length; j++) {
                long sum = 0;
                for (int k = 0; k < M[0].length; k++) {
                    sum = (sum+  M[i][k] * M2[k][j])%mod;
                }
                res[i][j] = sum;
            }
        }

        return res;
    }

    public static long[][] power_iter(long M[][], BigInteger n) {
        long result[][] = R.clone();
        while (n.compareTo(BigInteger.ZERO) > 0) {
            if (n.mod(new BigInteger("2")) != BigInteger.ZERO) {
                result = multiplicacion(result, M);
                n = n.subtract(BigInteger.ONE);
            } else {
                M = multiplicacion(M, M);
                n = n.divide(new BigInteger("2"));
            }
        }
        return result;
    }

}
