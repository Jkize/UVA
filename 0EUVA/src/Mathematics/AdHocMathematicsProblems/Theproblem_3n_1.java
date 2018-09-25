package Mathematics.AdHocMathematicsProblems;
/*Por el nombre de la función, diria que (aunque dices que ya la sabes) nexInt() 
te devuelve el siguiente entero, y hasNextInt() te devuelve un booleano diciendote si existe 
un siguiente entero, te devolverá True si existe, de lo contrario te devolverá False.

*/
// Problem 100 - The 3n + 1 problem
// 8/10/17 Jhoan Saavedra
import java.util.Scanner;

class Theproblem_3n_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             
        while(input.hasNextInt()){
            int i = input.nextInt();
            int j = input.nextInt();         

                if (j > i) {
                    System.out.println(i + " " + j + " " + aux(i, j));
                } else {
                    System.out.println(i + " " + j + " " + aux(j, i));
                }           

        }

    }

    static int aux(int i, int j) {

        int aux = 0;
        int con;
        for (int n = i; n <= j; n++) {
            int k = n;
            con = 0;
            while (k!=1) {

                if (k % 2 != 0) {
                    k = 3 * k + 1;
                } else {
                    k = k / 2;
                }

                con++;
            }
            if(k==1){
                con++;
            }

            if (aux < con) {
                aux = con;
            }

        }

        return aux;
    }
}

