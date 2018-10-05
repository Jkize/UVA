/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author ACER
 */
public class DepthFirstSearch {

    private boolean[] marked; // Has dfs() been called for this vertex?
    private int count; // last vertex on known path to this vertex
    private ArrayList connected;
    final int s;
    private int[] edgeTo;

    public DepthFirstSearch(Graph G, int s) {
        marked = new boolean[G.V()];
        connected = new ArrayList();
        edgeTo = new int[G.V()];
        this.s = s;
        dfs(G, s);
    }

    public void dfs(Graph G, int v) {
        marked[v] = true;
        connected.add(v);
        count++;
        for (Integer w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);

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
