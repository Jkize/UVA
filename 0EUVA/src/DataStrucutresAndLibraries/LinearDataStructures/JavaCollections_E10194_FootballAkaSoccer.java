package DataStrucutresAndLibraries.LinearDataStructures;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.HashMap;
import java.util.List; 

/**
 * 
 * @author Jkize
 * Uva 10194 Football Aka Soccer
 */
class JavaCollections_E10194_FootballAkaSoccer {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int cas =  Integer.parseInt(in.readLine());
        for (int i = 0; i < cas; i++) {
            String nameTorneo = in.readLine();
            int numequipos =  Integer.parseInt(in.readLine());
            List<String> equipos = new ArrayList<>();
            HashMap<String, int[]> equi = new HashMap<>();
            for (int k = 0; k < numequipos; k++) {
                String nameequi = in.readLine();
                equipos.add(nameequi);
                int n[] = {0,0,0,0,0,0,0,0};
                equi.put(nameequi, n);
            } 
            int partJug=Integer.parseInt(in.readLine());
            for(int k=0; k<partJug; k++){
                String datos[]=in.readLine().split("[#@]");     
                int n1=Integer.parseInt(datos[1]); 
                int n2=Integer.parseInt(datos[2]);           
                int res=n1-n2;        
                if(res!=0){ 
                    int golgan=0;
                    int golperd=0;
                    int gan=0;
                    int perd=0;
                    if(n1>n2){
                        golgan=n1;
                        golperd=n2;
                        gan=0;
                        perd=3;
                    }else{
                        golgan=n2;
                        golperd=n1;
                        gan=3;
                        perd=0;                        
                    }                
                    int n[]=equi.get(datos[gan]); 
                    n[0]+=3; n[1]+=1; n[2]+=1;  n[6]+=golgan; n[7]+=golperd; n[5]=(n[6]-n[7]);                  
                    n=equi.get(datos[perd]); 
                    n[1]+=1; n[4]+=1;   n[6]+=golperd; n[7]+=golgan; n[5]=(n[6]-n[7]);
                    
                }else{ 
                  int n[]=equi.get(datos[0]);  
                   n[0]+=1; n[1]+=1; n[3]+=1; n[6]+=n2; n[7]+=n2;    n[5]=(n[6]-n[7]);                    
                  n=equi.get(datos[3]);  
                  n[0]+=1; n[1]+=1; n[3]+=1; n[6]+=n2; n[7]+=n2;     n[5]=(n[6]-n[7]);                    
                }
            }            
            ordenar(equipos,equi);
            out.write(nameTorneo+"\n"); 
            out.flush();
           for(int k=0; k<equipos.size(); k++){
             int[] nn=equi.get(equipos.get(k)); 
           out.write((k+1)+") "+equipos.get(k)+" "+nn[0]+"p, "+nn[1]+"g "+"("+nn[2]+"-"+nn[3]+"-"+nn[4]+"), "+nn[5]+"gd ("+nn[6]+"-"+nn[7]+")\n");         
           
           }
           if(i!=cas-1){
           out.write("\n");
           out.flush();}else{
               out.flush();
           }
           
       
        }
    }

    private static void ordenar(List<String> equipos, HashMap<String, int[]> equi) {        
        Collections.sort(equipos, (String t, String t1) -> {        
            int n1[]=equi.get(t);
            int n2[]=equi.get(t1); 
            int gan=0; 
            if(n1[0]!=n2[0]){
                gan=(n1[0]>n2[0])?-1:1;                
                return gan;
            }            
            
            if(n1[2]!=n2[2]){
                gan=(n1[2]>n2[2])?-1:1;                
                return gan;
            }
            if(n1[5]!=n2[5]){
                gan=(n1[5]>n2[5])?-1:1;                
                return gan;
            }
            if(n1[6]!=n2[6]){
                 gan=(n1[6]>n2[6])?-1:1;                
                return gan;
            }
            if(n1[1]!=n2[1]){
                gan=(n1[1]>n2[1])?1:-1;                
                return gan;
            }
            return t.compareToIgnoreCase(t1);
        });
    }   

}

