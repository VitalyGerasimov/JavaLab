package com.company;

public class NOD {

    long a;
    long b;

    public NOD(long a, long b){
        this.a=a;
        this.b=b;
    }

    public long calculate( long a, long b){
        if (b==0)
            return a;
        else
            return calculate(b,a%b);
    }
}
