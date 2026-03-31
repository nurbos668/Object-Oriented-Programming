package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Zara", 3.5));
        students.add(new Student("Ali", 3.9));
        students.add(new Student("Mia", 2.8));
        students.add(new Student("Bob", 3.1));

        // сортировка по GPA (Comparable)
        Collections.sort(students);
        System.out.println("Sorted by GPA:");
        for (Student s : students) {
            System.out.println(s.getName() + " - " + s.getGpa());
        }

        // сортировка по имени (Comparator)
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s.getName() + " - " + s.getGpa());
        }
    }
}