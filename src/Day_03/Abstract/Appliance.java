package Day_03.Abstract;

public abstract class Appliance {
    public abstract void turnon();
    public void turnoff(){
        System.out.println("Turning off");
    }
}
class Fan extends Appliance{
    @Override
    public void turnon() {
        System.out.println("Turning on");
    }
}
class Main1{
    public static void main(String[] args) {
        Fan f = new Fan();
        f.turnoff();
        f.turnon();
    }
}
