package Day_06.Java_Lang_Classes;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("This is a message printed to the console.");
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of the loop: " + executionTime + " milliseconds");
    }
}
