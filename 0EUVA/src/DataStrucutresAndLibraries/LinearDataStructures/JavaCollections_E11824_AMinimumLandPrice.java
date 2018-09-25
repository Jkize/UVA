package DataStrucutresAndLibraries.LinearDataStructures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

/**
 * 
 * @author Jkize
 * Uva 11824 A Minimum Land Price 
 */
public class JavaCollections_E11824_AMinimumLandPrice {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int cas = Integer.parseInt(in.readLine());
        for (int i = 0; i < cas; i++) {
            PriorityQueue<Integer> price = new PriorityQueue<>();
            int n = 0;
            while ((n = Integer.parseInt(in.readLine())) != 0) {
                price.add(n);
            }
            int res = 0;
            for (int j = price.size(); j > 0; j--) {
                res += 2 * Math.pow(price.poll(), j);
            }
            if (res > 5000000) {
                out.write("Too expensive\n");
                out.flush();
            } else {
                out.write(res + "\n");
                out.flush();
            }

        }

    }

}
