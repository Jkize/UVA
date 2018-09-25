package DataStrucutresAndLibraries.NonLinearDataStructures;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;  
import java.util.Set;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class JavaTreeMap_E00484_TheDepartmentofRedundancyDepartment {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        BufferedWriter out =new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        Map<Integer,Integer> map=new LinkedHashMap<>();        
        while(in.hasNextInt()){
            n=in.nextInt();              
             if(map.containsKey(n)){
                 map.put(n, map.get(n)+1);
             }else{
                 map.put(n, 1);
             }             
             
        }
        
       Set iterator=map.entrySet();
       Iterator it=iterator.iterator();
       while(it.hasNext()){
        Map.Entry me=(Map.Entry)it.next();
        out.write(me.getKey()+" "+me.getValue()+"\n");
       }
       out.flush();
    }
}
