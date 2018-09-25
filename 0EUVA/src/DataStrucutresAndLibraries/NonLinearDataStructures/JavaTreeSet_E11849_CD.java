package DataStrucutresAndLibraries.NonLinearDataStructures;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
 
 class JavaTreeSet_E11849_CD {
    public static void main(String[] args) throws Exception{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        String h;
        while((h=in.readLine())!=null && !h.equals("0 0")){
            String g[]=h.split(" ");
            HashSet primero=new HashSet(); 
            for(int i=0; i<Integer.parseInt(g[0]); i++){
                primero.add(in.readLine());
            }
            int cont=0;
            for(int i=0; i<Integer.parseInt(g[1]); i++){
                String hs=in.readLine();
                if(primero.contains(hs)){
                    cont++;
                } 
            } 
           out.write(cont+"\n");
        }
        out.flush();
    }
}
