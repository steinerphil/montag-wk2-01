import students.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getName() {
        //given
        String expected = "Anja";
        Student test = new Student();
        test.setName(expected);
        //when
        String actual = test.getName();
        //then
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        //given
        int expected = 22;
        Student test = new Student();
        test.setAge(expected);
        //when
        int actual = test.getAge();
        //then
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getAverage() {
        //given
        double expected = 2.1;
        Student test = new Student();
        test.setAverage(expected);
        //when
        double actual = test.getAverage();
        //then
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void setName() {
        //given
        Student test = new Student();
        test.setName("peter");
        //when
        String actual = test.getName();
        //then
        assertEquals("Peter", actual);
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        //given
        Student test = new Student();
        test.setAge(22);
        //when
        int actual = test.getAge();
        //then
        assertEquals(22, actual);
    }

    @org.junit.jupiter.api.Test
    void setAverage() {
        //given
        Student test = new Student();
        test.setAverage(2.5);
        //when
        double actual = test.getAverage();
        //then
        assertEquals(2.5, actual);
    }
}