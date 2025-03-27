package Java.Optional;

import java.util.ArrayList;
import java.util.List;

// Java program without Optional Class
public class WithoutOptional {
    public static void main(String[] args)
    {
        //Case 1
        String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.print(word);
        
        //Case 2 
        List<String> a = new ArrayList();
        System.out.println(a.get(1));
        
    }
}

