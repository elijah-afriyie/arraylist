# Nested ArrayLists in Java

This Java program demonstrates how to use nested `ArrayList`s to store multiple categories of favorite items (such as devices, cars, and travel destinations) and how to retrieve specific lists and individual items from these categories.

## Description

The program creates an `ArrayList` of `ArrayList`s to store different categories of favorite items. It then performs the following operations:

1. Adds favorite devices to a list.
2. Adds favorite cars to another list.
3. Adds favorite travel destinations to yet another list.
4. Adds these lists to the main `ArrayList`.
5. Retrieves and prints the entire nested list, a specific category list, and an individual item from one of the lists.

## Code

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> favList = new ArrayList<>();

        ArrayList<String> favDevices = new ArrayList<>();
        favDevices.add("MacBook Pro");
        favDevices.add("LG-OLED");
        favDevices.add("PS5");

        ArrayList<String> favCars = new ArrayList<>();
        favCars.add("BMW M4");
        favCars.add("Toyota Land Cruiser");
        favCars.add("Range Rover Autobiography");

        ArrayList<String> travel = new ArrayList<>();
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
```

## Operations

1. **Creating and Adding Categories**:

   ```java
   ArrayList<String> favDevices = new ArrayList<>();
   favDevices.add("MacBook Pro");
   favDevices.add("LG-OLED");
   favDevices.add("PS5");

   ArrayList<String> favCars = new ArrayList<>();
   favCars.add("BMW M4");
   favCars.add("Toyota Land Cruiser");
   favCars.add("Range Rover Autobiography");

   ArrayList<String> travel = new ArrayList<>();
   travel.add("United States");
   travel.add("Dubai");

   favList.add(favDevices);
   favList.add(favCars);
   favList.add(travel);
   ```

   These lines create individual `ArrayList`s for different categories and add them to the main `favList`.

2. **Retrieving the Entire List**:

   ```java
   System.out.println(favList);
   ```

   This line prints the entire nested list.

3. **Retrieving a Specific Category List**:

   ```java
   System.out.println(favList.get(1));
   ```

   This line prints the list of favorite cars.

4. **Retrieving an Individual Item**:
   ```java
   System.out.println(favList.get(2).get(1));
   ```
   This line prints the travel destination "Dubai" from the travel list.

## Output

When the program is executed, it will output:

```
[[MacBook Pro, LG-OLED, PS5], [BMW M4, Toyota Land Cruiser, Range Rover Autobiography], [United States, Dubai]]
[BMW M4, Toyota Land Cruiser, Range Rover Autobiography]
Dubai
```

## Usage

To run this program, copy the code into a Java file (e.g., `Main.java`), then compile and run it using a Java compiler.

```sh
javac Main.java
java Main
```

This program serves as an example of how to use nested `ArrayList`s in Java for organizing and retrieving categorized data.
