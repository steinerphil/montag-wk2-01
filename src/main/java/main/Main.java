package main;

import students.Student;

public class Main {


    public static void main(String[] args) {
        Student first = new Student("peter", 22, 3.1);
        Student second = new Student("peter", 22, 4.1);

        System.out.println(first);
        System.out.println(first.equals(second));

    }
}
