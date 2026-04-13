package problem4;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // ========== 1. Создаём Employee ==========
        System.out.println("===== Employees =====");
        Employee e1 = new Employee("Alice",   50000, new Date(118, 5, 10),  "INS-001");
        Employee e2 = new Employee("Bob",     70000, new Date(120, 0,  1),  "INS-002");
        Employee e3 = new Employee("Charlie", 60000, new Date(119, 2, 15),  "INS-003");
        Employee e4 = new Employee("Diana",   60000, new Date(117, 9, 20),  "INS-004");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // ========== 2. Создаём Manager ==========
        System.out.println("\n===== Managers =====");
        Manager m1 = new Manager("Eve",   80000, 5000);
        Manager m2 = new Manager("Frank", 80000, 8000);

        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m2.addEmployee(e3);

        System.out.println(m1);
        System.out.println(m2);

        // ========== 3. Тест equals ==========
        System.out.println("\n===== equals =====");
        Employee e1Copy = new Employee("Alice", 50000, new Date(118, 5, 10), "INS-001");
        System.out.println("e1.equals(e1Copy): " + e1.equals(e1Copy)); // true
        System.out.println("e1.equals(e2):     " + e1.equals(e2));     // false

        // ========== 4. Comparable — сортировка по salary ==========
        System.out.println("\n===== Sort by salary (Comparable) =====");
        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, m1, m2));
        Collections.sort(list);
        list.forEach(System.out::println);

        // ========== 5. Manager compareTo — одинаковая salary, сравниваем по bonus ==========
        System.out.println("\n===== Manager compareTo (same salary → compare bonus) =====");
        System.out.println("m1.compareTo(m2): " + m1.compareTo(m2)); // отрицательное: bonus 5000 < 8000
        System.out.println("m2.compareTo(m1): " + m2.compareTo(m1)); // положительное

        // ========== 6. Comparator — сортировка по имени ==========
        System.out.println("\n===== Sort by name (NameComparator) =====");
        list.sort(new NameComparator());
        list.forEach(e -> System.out.println(e.getName()));

        // ========== 7. Comparator — сортировка по дате ==========
        System.out.println("\n===== Sort by hireDate (DateComparator) =====");
        List<Employee> withDates = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));
        withDates.sort(new DateComparator());
        withDates.forEach(e -> System.out.println(e.getName() + " → " + e.getHireDate()));

        // ========== 8. Clone Employee ==========
        System.out.println("\n===== Clone Employee =====");
        Employee e1Clone = e1.clone();
        System.out.println("Original: " + e1);
        System.out.println("Clone:    " + e1Clone);
        System.out.println("Same object?       " + (e1 == e1Clone));        // false
        System.out.println("Same values?       " + e1.equals(e1Clone));     // true
        System.out.println("Same date ref?     " + (e1.getHireDate() == e1Clone.getHireDate())); // false

        e1Clone.setSalary(99999);
        System.out.println("Original salary:   " + e1.getSalary());      // 50000
        System.out.println("Clone salary:      " + e1Clone.getSalary()); // 99999

        // ========== 9. Clone Manager ==========
        System.out.println("\n===== Clone Manager =====");
        Manager m1Clone = m1.clone();
        System.out.println("Original: " + m1);
        System.out.println("Clone:    " + m1Clone);
        System.out.println("Same team ref?     " + (m1.getTeam() == m1Clone.getTeam())); // false

        m1Clone.addEmployee(e3);
        System.out.println("Original team size: " + m1.getTeam().size());      // 2
        System.out.println("Clone team size:    " + m1Clone.getTeam().size()); // 3
    }
}