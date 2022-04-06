package com.lti.funint.prim;

import java.util.function.DoubleToIntFunction;
import java.util.function.ToIntFunction;

public class MyFuntionalInterface {

    public static void main(String[] args) {
    	
        double d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        f1.applyAsInt(d);
               
        
        System.out.println(f1);
        
        ToIntFunction f2 = x -> 1;
        f2.applyAsInt(d);
        System.out.println(f2);
    }
}