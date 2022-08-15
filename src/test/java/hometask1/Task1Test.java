package hometask1;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test{
private Task1 Task1 = new Task1();
    @Test
    void factorialUsingForTest() {
        /*assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Task1.factorialUsingFor(-1);
            }
        });*/

        assertThrows(IllegalArgumentException.class, () -> Task1.factorialUsingFor(-1));

        assertEquals(120, Task1.factorialUsingFor(5));
        assertEquals(1, Task1.factorialUsingFor(0));
    }

    @Test
    void factorialUsingRecursionTest() {
        assertThrows(IllegalArgumentException.class, () -> Task1.factorialUsingFor(-1));
        assertEquals(120, Task1.factorialUsingFor(5));
        assertEquals(1, Task1.factorialUsingFor(0));
    }
}