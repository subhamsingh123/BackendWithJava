package Java.Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WithOptional {
      public static void main(String[] args)
    {
        // Optional<String> checkNull = Optional.ofNullable(words[5]);
        //Case 1
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if(checkNull.isPresent()){
        System.out.print(checkNull.get().toLowerCase());
        }
        //Case 2 
        List<String> a = new ArrayList<>(Arrays.asList(null, null)); // Initialize with 2 nulls
        Optional<String> checkNullinList = Optional.ofNullable(a.get(1));

        if (checkNullinList.isPresent()) {
            System.out.println(checkNullinList.get());
        } else {
            System.out.println("Value is null");
        }
        }
    
}
