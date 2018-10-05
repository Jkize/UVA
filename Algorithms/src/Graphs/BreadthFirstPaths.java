/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author white
 */
public class BreadthFirstPaths {

    private boolean[] marked; // Has dfs() been called for this vertex?
    private int count; // last vertex on known path to this vertex
    private ArrayList connected;
    final int s;
    private int[] edgeTo;

    public BreadthFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        connected = new ArrayList();
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }

    public void bfs(Graph G, int s) {
        Queue<Integer> queue = new LinkedList();
        marked[s] = true;
        connected.add(s);
        count++;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            for (Integer w : G.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    marked[w] = true;
                    queue.add(w);
                    count++;
                    
                    connected.add(w);
                }
            }
        }

    }

    /**
     * if there a path from s to v?
     *
     * @param w
     * @return
     */
    public boolean hasPathTo(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }

    public List lista() {
        return connected;
    }

    /**
     * Path from s to v; null if no such path
     *
     * @param v
     * @return Iterable
     */
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }    
   
}
