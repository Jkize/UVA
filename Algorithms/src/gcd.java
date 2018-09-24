/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhoan Saavedra
 */
public class gcd {
    
    public static void main(String[] args) {
        System.out.println(gcd(12, 24));
    }
    public static int gcd(int p,int q){
        if(q==0)return p;
        int r=p%q;
        return gcd(q,r);
    }
}
