package Day_02.Constructors;

public class Book {
    String title;
    String author;

    Book(String title, String author)
    {
        this.title = "How to influence and win friends";
        this.author ="Dale Carnegie";
    }
    public void display()
    {
        System.out.println("Title : " +title);
        System.out.println("Author : "+author);
    }
    public static void main(String[] args) {
        Book b=new Book("How to influence and win friends","Dale");
        b.display();
    }
}
