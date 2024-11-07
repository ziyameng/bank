package tdd;

import java.util.Arrays;
import java.util.Collections;

public class HighestNumberFinder {
    public int findHighestNumber(int[] input) throws IllegalAccessException {

//        int highestSoFar=input[0];
//
//        if(input.length>1 && input[1]>highestSoFar){
//            highestSoFar = input[1];
//        }
//        return highestSoFar;

        if(input == null || input.length==0){
            throw new IllegalAccessException("Array cannot be empty");
        }

        int max = input[0];

        for(int no:input){
            if(no>max){
                max=no;
            }
        }
        return max;

    }
}
