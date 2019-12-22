package com.cursor.streams;

public class Main {

    public static void main(String[] args) {

        StreamExamples streamExamples = new StreamExamples();

        streamExamples.printAllClasses();
        streamExamples.printGroupedByNameStudentsList();
        streamExamples.printStudentsNames();
        streamExamples.printUserIdToStudent();
        streamExamples.printStudentsCountOlderThan(22);
    }
}
