package Java.Streams.Collectors;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //Collectors is a utility class
        //provide a set of methods to create common collectors

        List<String> names = Arrays.asList("subham","aman","rahul","aman"); 

        //collect as List 
        System.out.println(names.stream().collect(Collectors.toList()));
        //collect as set 
        System.out.println(names.stream().collect(Collectors.toSet()));

        //collect to any Specific collection
        ArrayDeque<String> dArray =  names.stream().collect(Collectors.toCollection(()-> new ArrayDeque<>()));

        //Joining Streams
        System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.joining(",")));

        //Summarizing data 
        // count , sum , min , average , max 
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,2,4,5,6);
        IntSummaryStatistics stats = nums.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println("Stats.getSum :"+ stats.getSum());
        System.out.println("Stats.getAverage :"+ stats.getAverage());
        System.out.println("Stats.getCount :"+ stats.getCount());
        System.out.println("Stats.getMax :"+ stats.getMax());
        System.out.println("Stats.getMin : "+ stats.getMin());

        //Group BY 
        System.out.println(nums.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));

        //Partitioning Elements 
        System.out.println(nums.stream().collect(Collectors.partitioningBy(x->x%2==0)));

        //Mapping and Collecting Elements 
        System.out.println(names.stream().collect(Collectors.mapping(x->x.toUpperCase(), Collectors.toList())));

        //collecting names by length
        List<String> names1 = Arrays.asList("subham","aman","rahul","aman","daman"); 
        System.out.println(names1.stream().collect(Collectors.groupingBy(x->x.length())));

        //Counting word Occurenceese
        String sentence = "hello world hello java world";
       System.out.println( Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));
    
       //Parititoning by even odd 
       List<Integer> nums1 = Arrays.asList(1,2,3,4,5,6,2,4,5,6);
      System.out.println(nums1.stream().collect(Collectors.partitioningBy(x->x%2==0)));


      //Summing values in map 
      Map<String,Integer> items = new HashMap();
      items.put("Apple",10);
      items.put("Banana",20);
      items.put("Orange",15);
      System.out.println(items.values().stream().collect(Collectors.summingInt(x->x)));

      //Create a map key as list and value as count 
      List<String> words = Arrays.asList("apple","banana","apple","orange","banana","apple");
      System.out.println(words.stream().collect(Collectors.toMap(k->k,v->1,(x,y)->x+y)));


      }
    }

