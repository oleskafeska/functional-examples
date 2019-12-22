package com.cursor.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {

        // Hello there

        List<Student> students = buildStudentList();

        long count = students.stream()
                .filter(student -> student.getAge() > 22)
                .count();

        System.out.println(count);

        List<String> studentsNames = students.stream()
                .filter(student -> student.getAge() < 26)
                .map(Student::getName)
                .collect(Collectors.toList());

        Set<String> listOfClasses = students.stream()
                .flatMap(student -> student.getClasses().stream())
                .collect(Collectors.toSet());

         System.out.println(listOfClasses);

        List<Student> anotherList = new ArrayList<>(students);

        AtomicInteger amountOfAge = new AtomicInteger(0);

        anotherList.forEach(student -> {

            amountOfAge.getAndAdd(student.getAge());
        });

        Map<String, Student> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getId, student -> student));

        System.out.println(studentMap);

        Map<String, Long> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

        System.out.println(collect);
    }

    public static List<Student> buildStudentList() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("1", "Patrick", 22, List.of("Math", "Biology")));

        students.add(new Student("2", "Patrick", 25, List.of("Math", "Chemistry")));

        students.add(new Student("3", "Alina", 21, List.of("Geometry", "Literature")));

        students.add(new Student("4", "Mark", 20, List.of("Physics", "History")));

        students.add(new Student("5", "Harry", 19, List.of("Economics", "Magic")));

        students.add(new Student("6", "Patrick", 25, List.of("Geography", "World History")));

        students.add(new Student("7", "Ostap", 26, List.of("Business Management", "Psychology")));

        students.add(new Student("8", "Evgenia", 23, List.of("Art", "Literature")));

        return students;
    }
}
