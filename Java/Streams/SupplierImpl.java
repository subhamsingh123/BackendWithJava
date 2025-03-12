package Java.Streams;

import java.util.function.Supplier;

public class SupplierImpl {

    public static String getValue(){
        return "testValue";
    }
    public static void main(String[] args) {


        Supplier<String> supply = () -> getValue();

        System.out.println( supply.get());
       
        
    }
}
