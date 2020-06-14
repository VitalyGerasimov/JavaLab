package com.company;

public class Couple implements Comparable<Couple>{
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


    public long NOK(long a,long b) {
        return a/NOD(a,b)*b;

    }

    public long NOD( long a, long b){
        if (b==0)
            return a;
        else
            return NOD(b,a%b);
    }

    public int comparison(Couple couple2){
        Couple couple1;
        couple1 = new Couple(this.getx(),this.gety());

        long NOK1=couple1.NOK((long)couple1.getx(),(long)couple1.gety());
        long NOK2=couple2.NOK((long)couple2.getx(),(long)couple2.gety());
        int v=0;
        if (NOK1>NOK2){
            v=1;
        } else if (NOK2>NOK1){
            v=-1;
        }
        else {
            if (couple1.getx()<couple2.getx()){v=1;}
            else if (couple1.getx()>couple2.getx()){v=-1;}
            else {
                if (couple1.gety()<couple2.gety()){v=1;}
                else {v=-1;}
                }
        }
        return v;
    }
    public int compareTo(Couple o2) {

        Couple couple2=(Couple) o2;
        int comparison = Couple.this.comparison(couple2);
        return comparison;

    }

    @Override
    public String toString() {
        return "Couple{" + x + " , "+y + "}   NOK:  "+NOK(Couple.this.getx(),Couple.this.gety());
    }
}
