package Java.Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        // Write a Java program to convert a List<String> into a List<Integer> representing the length of each string.

        List<String> test =  Arrays.asList("subham","Singh", "Vaibhav","Singh", "Aman","Singh");
        List<Integer> op= test.stream().map(x->x.length()).toList();
        System.out.println(op);


        // Find the top 3 largest numbers from a List<Integer> using Streams.
        List<Integer> amounts = Arrays.asList(1,2,3,4,5,6,7,100,101,102,8,9,10);
       System.out.println(amounts.stream().sorted(Comparator.reverseOrder()).limit(3).sorted().toList());
       System.out.println(amounts.stream().sorted().skip(amounts.size()-3).toList());


    //    Sort a list of Person objects by age using Streams.
    class Person{
        String name;
        int age;

        Person(String name, int age)
    {
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    }
    List<Person> persons = Arrays.asList(new Person("subham", 26),new Person("Grusha", 27),new Person("Vaibhav", 24),
    new Person("Harsh", 20));
    persons.stream().sorted((s1,s2)-> s1.getAge() - s2.getAge()).forEach(x->{ System.out.println( x.getName()+""+x.getAge());});



    //Traverse. Stream API
    Stream.iterate(1,x->x+1).skip(99999).limit(1).peek(System.out::println).count();
 
    }
    
}
