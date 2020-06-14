package com.company;

public class Sum implements math {
    @Override
    public int fold(int[] arr) {
        int sum=1;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}
