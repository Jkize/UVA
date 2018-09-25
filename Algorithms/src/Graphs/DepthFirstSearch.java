/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DepthFirstSearch {

    private boolean[] marked;
    private int count;
    private ArrayList connected;

    public DepthFirstSearch(Graph G, int s) {
        marked = new boolean[G.V()];
        connected=new  ArrayList();
        dfs(G, s);
    }

    public void dfs(Graph G, int v) {
        marked[v]=true;
        connected.add(v);
        count++;
        for(int w:G.adj(v)){
            if(!marked[w]) dfs(G,w);
        }

    }
    public boolean marked(int w){
        return marked[w];
    }
    public int count(){
        return count;
    }
    public List lista(){
        return connected;
    }
    /**
     * algoritmo p
     */

}
