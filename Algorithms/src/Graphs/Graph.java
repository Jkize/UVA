package Graphs;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Graph {
    private int V;
    private int edge;
    private int E;
    private ArrayList<Integer>adj[];
    public Graph(int v) {
        this.V=v;
        adj=new ArrayList[v];
        for(int i=0; i<adj.length; i++){
            adj[i]=new ArrayList<>();
        }
    }
    
    public void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }
    public int V(){
        return this.V; 
    }
    public int E(){
        return this.E; 
    }
    public Iterable<Integer>adj(int v){
        return adj(v);
    }
     
    
}
