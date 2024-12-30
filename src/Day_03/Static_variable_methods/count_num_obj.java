package Day_03.Static_variable_methods;

class Counter{
    static int count=0;

    public Counter(){
        count++;
    }
    public static void displayCount(){
        System.out.println("Count number of objects :"+count);
    }
}

public class count_num_obj {
    public static void main(String args[]){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        Counter.displayCount();
    }
}
