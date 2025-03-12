package Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(51);
        Consumer<List<Integer>> printList = x -> {

            for(Integer temp : x)
            System.out.println(temp);
        };
        print.accept(51);
        printList.accept(Arrays.asList(1,2,3,4,5,6));
    }
    
}
