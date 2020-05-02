package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public long compute(long value, long k) {
        long result;
        long resAnt;
        if (value < 0|| value > 40 || k < 0 || k >5  ) {
            throw new RuntimeException();
        }if(value == 0){
            result = 0;
        }else if(value == 1 || value == 2){
            result= 1;
        }else {
            //result = compute(value-1, k )+ k* compute(value -2, k);
            //resultAnt saves the result of the previous number which starts by one as result
            resAnt=1;
            result=1;
            for(int i =3; i<=value; i++) {
                result = result + k * resAnt;
                resAnt = result - k * resAnt;
            }
        }
        return result;
    }

}
