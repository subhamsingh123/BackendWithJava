package Java.Streams.Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //Q. Find the longest string in a list of strings using Java streams:
        List<String> strings = Arrays
              .asList("apple", "banana", "cherry", "date", "grapefruit");
              String biggestString = "";
              System.out.println(strings.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())));

              System.out.println(strings
              .stream()
              .max(Comparator.comparingInt(String::length)));


    
        // Q. Calculate the average age of a list of Person objects using Java streams:
        class Person{
            String name;
            int age;
            Person(String name, int age)
            {
                this.name = name;
                this.age = age;
            }
            
            public int getAge(){
                return age;
            }
        }
        List<Person> persons = Arrays.asList(
     new Person("Alice", 25),
     new Person("Bob", 30),
     new Person("Charlie", 35)
);

       System.out.println( persons.stream().mapToInt(Person::getAge).average().orElse(0));


       //Q. Check if a list of integers contains a prime number using Java streams:

       

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);

        // List<Integer> numbers = Arrays.asList( 4, 6, 8, 10);

        boolean containsPrime = false;
        System.out.println(numbers.stream().filter(StreamExample::isPrime).count());
        containsPrime= numbers.stream().filter(StreamExample::isPrime).count() > 0 ;
        System.out.println("List contains a prime number: " + containsPrime);


        boolean containsPrime2 = numbers.stream()
                                 .anyMatch(StreamExample::isPrime);
        System.out.println("List contains a prime number: " + containsPrime2);




        //Q. Merge two sorted lists into a single sorted list using Java streams:

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream()).sorted().toList();
        System.out.println(mergedList);



        //Q. Find the intersection of two lists using Java streams:
        List<Integer> list11 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list12 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> intersection = list11.stream().filter(x->list12.contains(x)).toList();
        System.out.println(intersection);



        //Q. Remove duplicates from a list while preserving the order using Java streams:

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> uniqueNumbers = numbersWithDuplicates.stream().distinct().toList();
        System.out.println(uniqueNumbers);


        //Q. Given a list of transactions, find the sum of transaction amounts for each day using Java streams:

        class Transaction{
            String date;
            int amount;

            Transaction(String date, int amount)
            {
                this.date= date;
                this.amount=amount;
            }

            public String getDate(){
                return date;
            }

            public int getAmount(){
                return amount;
            }

        }
        List<Transaction> transactions = Arrays.asList(
            new Transaction("2022-01-01", 100),
            new Transaction("2022-01-01", 200),
            new Transaction("2022-01-02", 300),
            new Transaction("2022-01-02", 400),
            new Transaction("2022-01-03", 500)
        );

        System.out.println( transactions.stream().distinct().collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount))));
       

        //Q. Find the kth smallest element in an array using Java streams:

        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element
        int kthSmallest = Arrays.stream(array).sorted().skip(k-1).findFirst().orElse(-1);
        System.out.println("kthSmallest"+kthSmallest);



        //Q. Given a list of strings, find the frequency of each word using Java streams:

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", 
        "banana", "apple");
        Map<String, Long> wordFrequency = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(wordFrequency);


        //Q. Given a list of integers, find all non duplicate integers using Java streams:

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 9);
        Map<Integer, Long> te = numbers1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(te);
        System.out.println(numbers1.stream().filter(x->te.get(x)>1).distinct().toList());
        // System.out.println(numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));

    }
    public static Boolean isPrime(int number)
       {
        if (number <= 1) {
          return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
          if (number % i == 0) {
              return false;
          }
        }
        return true;
      }
}
