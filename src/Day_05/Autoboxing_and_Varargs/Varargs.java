package Day_05.Autoboxing_and_Varargs;

public class Varargs {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum : " + sum(1, 2, 3));
        System.out.println("Sum " + sum(10, 20));
        System.out.println("Sum : " + sum(5));
        System.out.println("Sum : " + sum());
    }
}
