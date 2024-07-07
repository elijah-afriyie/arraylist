import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> favList = new ArrayList();

        ArrayList<String> favDevices = new ArrayList();
        favDevices.add("MacBook Pro");
        favDevices.add("LG-OLED");
        favDevices.add("PS5");

        ArrayList<String> favCars = new ArrayList();
        favCars.add("BMW M4");
        favCars.add("Toyota Land Cruiser");
        favCars.add("Range Rover Autobiography");
        
        ArrayList<String> travel = new ArrayList();
        travel.add("United States");
        travel.add("Dubai");
        
        favList.add(favDevices);
        favList.add(favCars);
        favList.add(travel);

        // Get entire list
        System.out.println(favList);

        // Get list of cars
        System.out.println(favList.get(1));

        // Get Dubai
        System.out.println(favList.get(2).get(1));
    }
}