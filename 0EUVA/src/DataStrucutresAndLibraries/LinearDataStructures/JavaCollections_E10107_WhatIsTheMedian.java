package DataStrucutresAndLibraries.LinearDataStructures;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 

/**
 * 
 * @author Jkize
 * Uva 10107 What is the median
 */

public class JavaCollections_E10107_WhatIsTheMedian {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
 
        String h="";
        List<Long> a=new ArrayList<>();
        while((h=in.readLine())!=null){
            a.add(Long.parseLong(h.trim()));  
            out.write(median(a)+"\n"); 
            out.flush();
        }
    }
    public static long median(List<Long> a ){
       if(a.size()==1)return a.get(0);
       Collections.sort(a);
       
       if(a.size()%2==0){
           int c=a.size()/2;
           return (a.get(c) +a.get(c-1))/2;           
       }else{
           return (a.get(Math.round(a.size()/2)));
       }      
       
    }
}
