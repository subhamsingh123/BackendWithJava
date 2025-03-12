package Java.Strings;
import java.util.Set;

public class StringPoolPrinter {
    public static void main(String[] args) {
        // Intern some strings
        "Hello".intern();
        "Java".intern();
        "Haryanvi".intern();

        // Access interned strings using SharedSecrets
       String[] stringPool= new String[10];
        // Print all strings in the pool
        for (String str : stringPool) {
            System.out.println(str);
        }
    }
}
