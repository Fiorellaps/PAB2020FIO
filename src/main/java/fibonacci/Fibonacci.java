package fibonacci;

public class Fibonacci {
    public long compute(long value, long k) {
        long result= 0;
        if (value < 0|| value > 40 || k < 0 || k >5  ) {
            throw new RuntimeException();
        }if(value == 0){
            result = 0;
        }else if(value == 1 || value == 2){
            result= 1;
        }else {
            result = compute(value-1, k )+ k* compute(value -2, k);
        }
        return result;
    }

}
