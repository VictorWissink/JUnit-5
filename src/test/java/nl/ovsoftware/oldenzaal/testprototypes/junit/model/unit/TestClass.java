package nl.ovsoftware.oldenzaal.testprototypes.junit.model.unit;

import nl.ovsoftware.oldenzaal.testprototypes.junit.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.naming.CannotProceedException;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@DisplayName("jUnit 5 example testcases")
public class TestClass {

    @Test
    @DisplayName("testing the toString() method of User")
    public void toStringTest() {
        int age = 32;
        double salary = 23423;
        String name = "theodor";
        Long id = (long) 323;

        User user = new User();
        user.setAge(age);
        user.setSalary(salary);
        user.setName(name);
        user.setId(id);

        String expected = "User [id=" + id + ", name=" + name + ", age=" + age
                + ", salary=" + salary + "]";

        assertEquals(expected, user.toString());
    }

    @Test
    @DisplayName("Testing the getters of User")
    public void gettersTest() {
        int age = 32;
        double salary = 23423;
        String name = "theodor";
        Long id = (long) 323;

        User user = new User();
        user.setAge(age);
        user.setSalary(salary);
        user.setName(name);
        user.setId(id);

        assertAll(
                "Assert All the getters",
                () -> assertEquals(id, user.getId(), "ID is not equal, expected: " + id),
                () -> assertEquals(Integer.valueOf(age), user.getAge(), "age is not equal, expected: " + age),
                () -> assertEquals(salary, user.getSalary(), "salary is not equal, expected: " + salary),
                () -> assertEquals(name, user.getName(), "name is not equal, expected: " + name)
                );
    }



    @Test
    @DisplayName("Testing ")
    public void assertExceptionTest() {

        User user = new User();
        // Can't catch an unhandled exception?

       //  assertThrows(CannotProceedException.class, () -> user.catchesException(1), "a message");
         assertThrows(CannotProceedException.class, () -> user.throwsException(0), "a message");


    }

    @Test
    @DisplayName("This test is only run on Fridays, otherwise it's skipped")
    public void testAdd_OnlyOnFriday() {
        LocalDateTime ldt = LocalDateTime.now();
        assumeTrue(ldt.getDayOfWeek().getValue() == 5);
        int age = 32;
        double salary = 23423;
        String name = "thankgoditsfriday";
        Long id = (long) 323;

        User user = new User();
        user.setAge(age);
        user.setSalary(salary);
        user.setName(name);
        user.setId(id);

        assertEquals(name, user.getName());

    }

    @Test
    @DisplayName("This test is only failed on Fridays (with lambda)")
    public void testAdd_OnlyOnFriday_WithLambda() {
        LocalDateTime ldt = LocalDateTime.now();
        assumingThat(ldt.getDayOfWeek().getValue() == 5,
                () -> {
                   fail("make the test fail on fridays");
                });
        int age = 32;
        double salary = 23423;
        String name = "theodor";
        Long id = (long) 323;

        User user = new User();
        user.setAge(age);
        user.setSalary(salary);
        user.setName(name);
        user.setId(id);

        assertEquals(name, user.getName());

    }







}
