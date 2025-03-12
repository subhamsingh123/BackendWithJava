package Java.Streams.BiStreams;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,String> add = (a,b) -> (""+a+b);
        System.out.println( add.apply(5, 3));
       
    }
}
