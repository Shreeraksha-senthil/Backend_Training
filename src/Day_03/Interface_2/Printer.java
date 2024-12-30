package Day_03.Interface_2;

interface Printer {
    void print();
}
interface Scanner {
    void scan();
}

class AllInOne implements Printer, Scanner
{
    @Override
    public void print() {
        System.out.println("Printing All In One");
    }
    @Override
    public void scan() {
        System.out.println("Scanning All In One");
    }
}

class Main{
    public static void main(String[] args) {
        AllInOne a = new AllInOne();
        a.print();
        a.scan();
    }
}