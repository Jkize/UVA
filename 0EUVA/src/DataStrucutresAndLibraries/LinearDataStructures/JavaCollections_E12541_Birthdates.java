package DataStrucutresAndLibraries.LinearDataStructures;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Date;
import java.util.List;

 
/**
 *
 * @author Jkize
 * Uva 12541 Birthdates
 */
class JavaCollections_E12541_Birthdates {

    public static void main(String[] args) throws ParseException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(in.readLine());
        List<nino> lista=new ArrayList<>();
        while(num--!=0){ 
            String dat[]=in.readLine().split(" ",2);
            nino a=new nino(dat[0], sdf.parse(dat[1]));
            lista.add(a);
        }
        Collections.sort(lista, (t, t1) -> {            
            return (t1.getFecha()).compareTo(t.getFecha()); 
        });
      
        out.write(lista.get(0).getName()+"\n"+lista.get(lista.size()-1).getName()+"\n");
        out.flush();
        
        
      
    }

   static class nino {

        private String name;
        private Date fecha;

        public nino(String name, Date fecha) {
            this.name = name;
            this.fecha = fecha;
        }

        public String getName() {
            return name;
        } 

        public Date getFecha() {
            return fecha;
        } 
    }

}
