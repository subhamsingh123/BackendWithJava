package Java.Streams;

import java.util.function.Function;

public class FunctionsImpl {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt = x -> x*2;
        Function<Integer,Integer> tripleIt = x -> x*3;
        System.out.println( doubleIt.apply(5));
        System.out.println( doubleIt.andThen(tripleIt).apply(10));
        Function.identity();
       
    }
}
