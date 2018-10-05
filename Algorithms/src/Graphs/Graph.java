package Graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class Graph {

    private int V;
    private int edge;
    private int E;
    private ArrayList<Integer> adj[];

    public Graph(int v) {
        this.V = v;
        adj = new ArrayList[v];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        //adj[w].add(v);
        E++;
    }

    public int V() {
        return this.V;
    }

    public int E() {
        return this.E;
    }

    public Iterable<Integer> adj(int v) {
        return this.adj[v];
    }

    /**
     * Test co
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Graph grap = new Graph(6);
      
        int n;
        while ((n = in.nextInt()) != -1) {
            int b = in.nextInt();
            grap.addEdge(n, b);
        }

        //Grafo en profundidad desde 0
        /**
         * 0 2
         * 2 1
         * 2 3
         * 3 4
         * 3 5
         */
        DepthFirstSearch depth = new DepthFirstSearch(grap, 0);
        String c = "";

        //Camino de 0 a 5.
        Iterator a = depth.pathTo(5).iterator();
        while (a.hasNext()) {
            c += String.valueOf(a.next()) + " ";
        }
        System.out.println(c);

        //Todos los nodos que tiene 0;
        for (int i = 0; i < depth.lista().size(); i++) {
            System.out.print(depth.lista().get(i) + " ");
        }
        System.out.println("");

        /**
         * Resultado
         *
         * 5 3 2 0
         * 0 2 1 3 4 5
         *
         */
        
        
        /**
         * Ahora con BreadthFirstPaths
         */
        /**
         * 0 2
         * 0 1
         * 0 5
         * 2 3
         * 2 4
         */
        grap = new Graph(6);
        while ((n = in.nextInt()) != -1) {
            int b = in.nextInt();
            grap.addEdge(n, b);
        }
        BreadthFirstPaths bread = new BreadthFirstPaths(grap, 5);

        //Camino de 0 a 5.
        Iterator aa = bread.pathTo(5).iterator();
        while (a.hasNext()) {
            c += String.valueOf(a.next()) + " ";
        }
        System.out.println(c);

        //Todos los nodos que tiene 0;
        for (int i = 0; i < bread.lista().size(); i++) {
            System.out.print(depth.lista().get(i) + " ");
        }
        System.out.println("");

    }
}
