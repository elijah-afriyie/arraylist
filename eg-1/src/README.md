# Java ArrayList Operations

This Java program demonstrates how to perform various operations on an `ArrayList` of car brands, including adding elements, modifying an element, removing an element, and clearing the entire list.

## Description

The program creates an `ArrayList` to store a list of car brands. It then performs the following operations:

1. Adds three car brands to the list.
2. Modifies the second element in the list.
3. Removes the third element in the list.
4. Clears all elements from the list.
5. Attempts to print each element in the list using a `for` loop.

## Code

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("AMG");
        cars.add("Audi");

        cars.set(1, "Porsche");
        cars.remove(2);
        cars.clear();

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
```

## Operations

1. **Adding Elements**:

   ```java
   cars.add("BMW");
   cars.add("AMG");
   cars.add("Audi");
   ```

   These lines add three car brands to the `ArrayList`.

2. **Modifying an Element**:

   ```java
   cars.set(1, "Porsche");
   ```

   This line modifies the second element (index 1) in the `ArrayList` from "AMG" to "Porsche".

3. **Removing an Element**:

   ```java
   cars.remove(2);
   ```

   This line removes the third element (index 2) in the `ArrayList`, which is "Audi".

4. **Clearing the List**:

   ```java
   cars.clear();
   ```

   This line clears all elements from the `ArrayList`.

5. **Printing Elements**:
   ```java
   for (int i = 0; i < cars.size(); i++) {
       System.out.println(cars.get(i));
   }
   ```
   This loop attempts to print each element in the `ArrayList`. However, since the list has been cleared, nothing will be printed.

## Output

The program will not print anything because the `ArrayList` is cleared before the `for` loop attempts to print the elements.

## Usage

To run this program, copy the code into a Java file (e.g., `Main.java`) and compile and run it using a Java compiler.

```sh
javac Main.java
java Main
```

This program serves as a basic example of how to use the `ArrayList` class in Java for common list operations.
