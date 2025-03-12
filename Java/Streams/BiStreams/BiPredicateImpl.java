package Java.Streams.BiStreams;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateImpl {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x+y)%2==0;
        Consumer<Boolean> print = x -> System.out.println(x);
        print.accept(isSumEven.test(5, 5));
    }
}
