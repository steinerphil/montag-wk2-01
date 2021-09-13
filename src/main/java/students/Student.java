package students;

public class Student {

    private String name;
    private int age;
    private double average;

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

    // SETTER
    public void setName(String name) {
        String cap = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.name = cap;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
