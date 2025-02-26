public class NumberofCores {
    public static void main(String[] args) {
        // Get the number of available processors (cores)
        int cores = Runtime.getRuntime().availableProcessors();

        // Print the number of cores
        System.out.println("Number of cores in the system: " + cores);
    }
}
