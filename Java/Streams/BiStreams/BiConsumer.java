package Java.Streams.BiStreams;

public class BiConsumer {
    public static void main(String[] args) {
        
        java.util.function.BiConsumer<Integer,Integer> Printit  = (a,b) ->{
            System.out.println(a);
            System.out.println(b);
        };

     Printit.accept(1, 2);
    }   
}



