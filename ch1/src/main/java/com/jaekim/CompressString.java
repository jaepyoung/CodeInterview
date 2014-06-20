package com.jaekim;

/**
 * Created by jaepyoung on 6/19/2014.
 */
public class CompressString {
    public String compressString(String input) {
        if (input == null ||input.length()==0){
            return null;
        } else if (input.length()==1){
            return input;
        } else if (input.length()==2){
            char[] inputArray = input.toCharArray();
            if (inputArray[0]==inputArray[1]){
                return input.substring(0,1)+"2";
            } else {
                return input;
            }
        } else {
            StringBuffer result = new StringBuffer();
            result.append(input.substring(0,1));
            char[] inputArray = input.toCharArray();
            int tag=1;

            for (int i=0;i<input.length()-1;i++){
                String firstChar = new String();
                if (i != (input.length()-1)) {

                    if (inputArray[i]==inputArray[i+1]){
                         if (tag==1){
                                firstChar = String.valueOf(inputArray[i]);
                             System.out.print("Test"+firstChar);
                         }

                         tag++;

                    } else {
                        firstChar = String.valueOf(inputArray[i]);
                        result.append(firstChar).append(tag);
                        tag=1;
                    }
                } else {
                    firstChar = String.valueOf(inputArray[i]);
                    result.append(firstChar).append(tag);
                }

            }
            if (result.toString().length()<input.length()){
               return result.toString();
            } else {
                return input;
            }

        }
    }
}
