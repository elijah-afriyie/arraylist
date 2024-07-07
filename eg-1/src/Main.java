import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String> ();
        cars.add("BMW");
        cars.add("AMG");
        cars.add("Audi");

        // cars.set(1, "Porche");
        // cars.remove(2);
        // cars.clear();

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}