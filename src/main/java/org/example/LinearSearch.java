package org.example;

public class LinearSearch {
    
    public static int search(int[] arrayInt, int target){

        for(int i = 0; i < arrayInt.length; i++ ){
            if(arrayInt[i] == target){
                return i;
            }

        }
        return -1;
        
        
    }
    
}
