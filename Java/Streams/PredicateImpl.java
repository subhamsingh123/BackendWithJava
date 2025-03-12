package Java.Streams;

import java.util.function.Predicate;

public class PredicateImpl {
   public static void main(String[] args) {
    
      Predicate<Integer> isEven = (a) -> a%2==0;
      System.out.println(isEven.test(10));

      Predicate<String> endsWithA = (a) -> a.endsWith("a");
      System.out.println(endsWithA.test("Subham"));
      System.out.println(endsWithA.test("Ankita"));
   }
    
}
