package Day_05.Autoboxing_and_Varargs;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
