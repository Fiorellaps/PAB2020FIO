package org.pab2020.factorial;

/**
 * This class implemets a factorial function
 */
public class Factorial {

    public long compute(long value) {
        long result;
        if (value < 0|| value >= 26) {
            throw new RuntimeException();
        } else if ((value == 0) || (value == 1)) {
            result = 1;
        } else {
            // Computacionalmente mejor usar un for
            //result = value * compute(value-1);
            result = 1;
            for (int i = 1; i <= value; i++) {
                result = i * result;
            }
        }

        return result;
    }
    public static void main(String[] args){
        Factorial f = new Factorial();
        long res = f.compute(26);
        System.out.println(res);

    }


}

