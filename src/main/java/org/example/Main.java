package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //14.1
      List<Integer> list = List.of(333, 8, 15, 42, 7, 10, 23, 4, 99, 16, 5, 28);
        System.out.println("Исходный список: " + list);
        System.out.println("Чётные числа:");

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        //14.2
        List<String> names = List.of(
                "иван", "Мария", "ПЁТР"
        );
        System.out.println("Исходный список: " + names);
        System.out.println("Отсортированные имена:");
        names.stream()
                .map(Main::capitalize)
                .sorted()
                .forEach(System.out::println);
        //14.3
        List<Student> students = List.of(
                new Student("Иван", 5),
                new Student("Мария", 3),
                new Student("Пётр", 4),
                new Student("Анна", 5),
                new Student("Олег", 2),
                new Student("Екатерина", 4),
                new Student("Сергей", 5),
                new Student("Наташа", 3)
        );

        int threshold = 4;

        List<Student> best = students.stream()
                .filter(s -> s.getGrade() > threshold)
                .collect(Collectors.toList());

        System.out.println("Порог: выше " + threshold);
        System.out.println("Отобрано студентов: " + best.size());
        System.out.println("Имена:");

        best.forEach(s -> System.out.println("  " + s.getName()));
    }
    static String capitalize(String name)
    {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
    }



