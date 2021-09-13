package students;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @ParameterizedTest
    @MethodSource("getArguments")

    void toString(Student students, String expected) {
        //when
        String actual = students.toString();
        //then
        assertEquals(expected, actual);

    }

    public static Stream<Arguments> getArguments(){
        return Stream.of(Arguments.arguments(
                new Student("kevin", 21, 2.1), "Student{" +
                        "name='" + "Kevin" + '\'' +
                        ", age=" + "21" +
                        ", average=" + "2.1" +
                        ", semester=" + "1" +
                        '}'
               // new Student("alex", 30, 1.0), "Name: Alex, Age: 30, Average: 1.0"
        ));
    }
}