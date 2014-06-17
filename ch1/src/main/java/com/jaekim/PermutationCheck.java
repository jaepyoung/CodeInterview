package com.jaekim;

import java.util.Arrays;

/**
 * Created by jaepyoung on 6/16/2014.
 */
public class PermutationCheck {
    public Boolean isPermtation( String string1, String string2) {
       if (string1 == null && string2 == null) {
           return true;
       } else if(string1 == null && string2 !=null) {
           return false;
       } else if(string2 == null && string1 !=null){
           return false;
       } else {
           if (string1.length()!=string2.length()){
               return false;
           }
           char[] string1Array1 = string1.toCharArray();
           char[] string1Array2 = string2.toCharArray();
           Arrays.sort(string1Array1);
           Arrays.sort(string1Array2);
           String sortedString1 = new String(string1Array1);
           String sortedString2 = new String(string1Array2);

           if (sortedString1.equals(sortedString2)){
               return true;
           } else
           {
               return false;
           }

       }

    }
}
