package Day_05.Static_import;

import static java.lang.Math.*;

public class Hypotenuse {
    public static void main(String[] args) {
        double side1 = 3.0;
        double side2 = 4.0;
        double hypotenuse = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
