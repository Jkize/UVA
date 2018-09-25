package Mathematics.AdHocMathematicsProblems;

// Problem 10346 - Peter's Smokes
// 9/10/17 Jhoan Saavedra

import java.util.Scanner;
class MathematicalSimulationEasier_E10346_Peters_Smokes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          
        while (input.hasNext()) {
           int n = input.nextInt();
           int k = input.nextInt();
           int c=n;
           while(n>=k){
               c+=n/k;
               
               n=(n/k)+(n%k);
           }
            System.out.println(c);
        }

    }

     
}
