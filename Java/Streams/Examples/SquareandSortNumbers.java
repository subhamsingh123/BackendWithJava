package Java.Streams.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SquareandSortNumbers {
    public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(5,2,1,9,6);
      List<Integer> newList = numbers.stream().map(x->x*x).sorted().toList();
      System.out.println(newList);
    // sum of the new list;
    System.out.println("sum " + newList.stream().reduce(0,(a,b)->a+b));
    

    
    }
    
}
