package Day_03.Static_variable_methods;

class Utility {
    public static String convertToUpper(String str) {
        return str.toUpperCase();
    }
}

public class convertToUppercase {
    public static void main(String[] args) {
        String input = "Hello,World!";
        String result = Utility.convertToUpper(input);
        System.out.println("Converted to Uppercase: " + result);
    }
}