package paralelo;

import org.pab2020.factorial.Factorial;
import org.pab2020.factorial.HeavyFactorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Calcular el factoial de una lista de numeros
 * Lo quiero hacer en paralelo
 */


public class factorialParalelo {
    public static void main(String[] args){
        // version clasicaList<Integer> numbers= Array.asList(1, 2,3,4,5,7,10,20,30,40);
        //version nueva java 11
        List<Integer> numbers=List.of(1,2,3,4,5,7,10,20,11,12);
        List<Long> factorialValues = new ArrayList<>();
        HeavyFactorial factorial = new HeavyFactorial();
        long initTime = System.currentTimeMillis();
       // for (int i = 0; i < numbers.size(); i++) {
        //    factorialValues.add(factorial.compute(numbers.get(i)));
      //  }
        //Stream coge lista y la transforma en flujo de datos, coge los numeroos
        //y a cada elemento de la etapa anterior me devuelve lo que yo le pide
        // la etapa siguiente ya es el collect que es que guarde el resultado en una lista
        //en map usa el stream
        factorialValues= numbers
                //.stream()
                .parallelStream()
                .map(number -> factorial.compute(number))
                .collect(Collectors.toList());


        long totalTime = System.currentTimeMillis() - initTime;
        System.out.println("Total computing time :" + totalTime+ " millisegundos");
        for (int i = 0; i < factorialValues.size(); i++){

        System.out.println("Number:" + numbers.get(i) +  ". Factorial:" + factorialValues.get(i));
        }

    }
}
