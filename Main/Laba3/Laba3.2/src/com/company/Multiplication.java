package com.company;

public class Multiplication implements math {

    @Override
    public int fold(int[] arr) {
        int multiplication=1;
        for(int i:arr){
            multiplication*=i;
        }
        return multiplication;
    }
}
