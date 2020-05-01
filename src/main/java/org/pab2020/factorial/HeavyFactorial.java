package org.pab2020.factorial;

public class HeavyFactorial extends Factorial{
    @Override
    public long compute(long value){
        for(long i = 0; i <500000; i ++) {
            double dummy = Math.sin(2.352 + i) * Math.cos(i - 0.235);
        }
        return super.compute(value);
    }



}
