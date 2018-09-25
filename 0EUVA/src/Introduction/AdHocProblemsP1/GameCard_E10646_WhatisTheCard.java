package Introduction.AdHocProblemsP1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class GameCard_E10646_WhatisTheCard {

    public static void main(String[] args) throws IOException {
        //BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int cas = in.nextInt();
        for (int i = 1; i <= cas; i++) {
            Stack<String> inicial = new Stack<>();
             Queue<String> b = new LinkedList<>(); 
            for (int k = 1; k <=52; k++) {
               String sas=in.next();
               if(k>27){
                   b.add(sas);
               }else{
               inicial.push(sas);}
            }    
            int y=0;
            for (int k = 0; k < 3; k++) {
                String t = inicial.pop();           
                 try {
                    int numsacar = Integer.parseInt("" + t.charAt(0));
                    y+=numsacar;
                    int r = 10 - numsacar; 
                    for (int j = 0; j < r; j++) {
                        inicial.pop();                        
                    }
                } catch (NumberFormatException e) {
                   y+=10;
                }

            }
            while (!b.isEmpty()) {
               inicial.push(b.remove());
            }
            System.out.printf("Case %d: %s\n",i,inicial.elementAt(y-1));
        }
    }

}
