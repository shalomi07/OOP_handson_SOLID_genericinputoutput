package no9_serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    String name;
    int age;

    Employee(String n, int a) {
        name = n;
        age = a;
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30));
        employees.add(new Employee("Jane", 25));
        employees.add(new Employee("Budi", 28));

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("emp.ser"))) {
            oos.writeObject(employees);
            System.out.println("Serialized successfully.");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        List<Employee> restoredList = deserialize("emp.ser");
        if (restoredList != null) {
            for (Employee emp : restoredList) {
                System.out.println("Deserialized: " + emp.name + ", " + emp.age);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }
}
