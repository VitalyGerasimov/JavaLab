package com.company.tests;

import com.company.Couple;
import org.junit.jupiter.api.Test;
import com.company.NOD;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class NODTest {
@Test
    public void stressTest(int n){

    long start = System.currentTimeMillis();
    NOD nod = new NOD(0,0);
    final Random random = new Random();
    int a,b;
    for (int i=0;i<n;i++){
        a=random.nextInt(1000);
        b=random.nextInt(1000);
        long v = nod.calculate(a,b);
    }
    long finish = System.currentTimeMillis();
    long timeOfMethod = finish-start;
    System.out.println("Method execurion time:   "+timeOfMethod);
    System.out.println("Average time to execute a method NOD:  "+timeOfMethod/n);
}
@Test
    public void stressTestGeneration(){
    stressTest(1000);
    stressTest(1000000);
    stressTest(1000000000);
    }

    @Test
            public void simpleTestOne(){
        NOD nod = new NOD(0,0);
        Couple[] array= new Couple[4];
        array[0]=new Couple(3,9);
        array[1]=new Couple(27,81);
        array[2]=new Couple(20,82);
        long[] expected = {3,27,2};
        long[] testarray = new long[3];
        for (int i=0;i<3;i++){
            testarray[i]=nod.calculate(array[i].getx(),array[i].gety());
        }
        assertArrayEquals(expected,testarray);
    }
    @Test
    public void simpleTestTwo(){
        NOD nod = new NOD(0,0);
        Couple[] array= new Couple[10];
        array[0]=new Couple(3,9);
        array[1]=new Couple(27,81);
        array[2]=new Couple(20,82);
        array[3]=new Couple(5,19);
        array[4]=new Couple(220,182);
        array[5]=new Couple(221,182);
        array[6]=new Couple(2000,1200);
        array[7]=new Couple(50,51);
        array[8]=new Couple(69,92);
        array[9]=new Couple(200,8);
        long[] expected = {3,27,2,1,2,13,400,1,13,8};
        long[] testarray = new long[3];
        for (int i=0;i<10;i++){
            testarray[i]=nod.calculate(array[i].getx(),array[i].gety());
        }
        assertArrayEquals(expected,testarray);
    }
}

