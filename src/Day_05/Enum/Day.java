package Day_05.Enum;

public class Day {
    public enum days{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    }
    public static void main(String args[]){
        days today= days.Saturday;
        switch (today){
            case Monday, Tuesday, Wednesday, Thursday, Friday:
                System.out.println("It's a weekday!");
                break;
            case Saturday, Sunday:
                System.out.println("It's a weekend!");
                break;
        }
    }
}
