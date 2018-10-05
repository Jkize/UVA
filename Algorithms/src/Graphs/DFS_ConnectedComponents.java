/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs; 

/**
 *
 * @author white
 */
public class DFS_ConnectedComponents {

    private boolean[] marked; // Has dfs() been called for this vertex?
    private int count; // 
    private int[] id;

    public DFS_ConnectedComponents(Graph G) {
        id = new int[G.V()];
        for (int s = 0; s < G.V(); s++) {
            if (!marked[s]) {
                dfs(G, s);
                count++;
            }
        }
    }

    public void dfs(Graph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (Integer w : G.adj(v)) {
            if (!marked[w]) {
                id[w] = v;
                dfs(G, w);
            }
        }

    }

    public boolean connected(int v, int w) {
        return id[v] == id[w];
    }

    public int id(int v) {
        return id[v];
    }

    public int count() {
        return count;
    }
}
