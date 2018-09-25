
package NOSubidas_Sin_Verificar;

import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class E417_Word_Index {

    static HashMap<String, Integer> map = new HashMap<>();

    static void inicio() {
        int n = 0;
        char sas[] = new char[26];
        for (int i = 'a'; i <= 'z'; i++) {
            char a = (char) i;
            sas[i - 97] = (char) i; 
            map.put("" + (char) i, ++n);
        }
        String a="";
        for (int i = 0; i < sas.length - 1; i++) {
            a+=sas[i];
            for (int j = i + 1; j < sas.length; j++) { 
              a+=sas[j];
              map.put(a, ++n);
            }
            a="";
        }
        
        
        for(int i=0; i<sas.length-2; i++){
            a+=sas[i];
            for(int j=i+1; j<sas.length-1; j++){
                 a+=sas[j];
                for(int k=j+1; k<sas.length; k++){
                     a+=sas[k];
                    map.put(a, ++n);
                }
            }
            a="";
        }
        
           for(int i=0; i<sas.length-3; i++){
                a+=sas[i];
            for(int j=i+1; j<sas.length-2; j++){
                 a+=sas[j];
                for(int k=j+1; k<sas.length-1; k++){
                       a+=sas[k];
                    for(int l=k+1; l<sas.length; l++){
                         a+=sas[l];
                         map.put(a, ++n);
                        
                    }
                }
            }
            a="";
        }
           
          for(int i=0; i<sas.length-4; i++){
              a+=sas[i];
            for(int j=i+1; j<sas.length-3; j++){
                a+=sas[j];
                for(int k=j+1; k<sas.length-2; k++){
                      a+=sas[k];
                    for(int l=k+1; l<sas.length-1; l++){
                        a+=sas[l];
                        for(int m=l+1; m<sas.length; m++){
                             a+=sas[m];
                         map.put(a, ++n);
                        
                        }
                    }
                }
            }
            a="";
        }
        
    
    }

    public static void main(String[] args) {
        inicio();
        System.out.println("listo");
    }
}
