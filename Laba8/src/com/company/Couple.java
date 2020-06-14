package com.company;
import com.company.NOD;
public class Couple{
    protected int x;
    protected int y;

    public Couple(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getx(){
        return Couple.this.x;
    }
    public int gety(){
        return  Couple.this.y;
    }


}