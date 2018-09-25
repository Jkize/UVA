/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NOSubidas_Sin_Verificar;

/**
 *
 * @author ACER
 */
public class E10140_Distancia_Primos {
    static int[] tableprimos;

    public static void iniciar() {
        int n=1234;
        tableprimos = new int[n+1];
        tableprimos[1]=1;
        tableprimos[0]=1;
        int tope = (int) Math.floor(Math.sqrt(n));
        for (int i = 2; i <= tope; i++) {
            if (tableprimos[i] == 0) {
                for (int j = i; j <= n / i; j++) {
                    tableprimos[i * j] = 1;
                }
            }

        }
    }

    public static void main(String[] args) {
        iniciar();
        System.out.println("terminado");
    }

}
