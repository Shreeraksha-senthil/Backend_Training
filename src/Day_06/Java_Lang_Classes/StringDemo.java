package Day_06.Java_Lang_Classes;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string: " + length);
        String upperCaseStr = str.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseStr);
        String subString = str.substring(7);
        System.out.println("Substring: " + subString);
    }
}
