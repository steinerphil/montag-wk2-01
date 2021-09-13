package students;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private double average;
    private int semester;

    public Student(String name, int age, double average) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.age = age;
        this.average = average;
        this.semester = 1;
    }

    // GETTER
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", average=" + average +
                ", semester=" + semester +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
