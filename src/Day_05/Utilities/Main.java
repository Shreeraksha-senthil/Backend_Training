package Day_05.Utilities;

import Day_05.Utilities.Container;
import Day_05.Utilities.Priority;

public class Main {
    public static void main(String[] args) {
        Integer age = 25;
        Container<Integer> ageContainer = new Container<>(age);
        int ageFromContainer = ageContainer.getObject();
        Priority taskPriority = Priority.HIGH;
        System.out.println("Age: " + ageFromContainer);
        System.out.println("Task Priority: " + taskPriority);
    }
}
