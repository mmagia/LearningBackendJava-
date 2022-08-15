package hometask1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    void test()
    {
        int[] arr = {0, 24, 4, 12, 8, 2, 1, -2, -4, -6};
        int[] resultedArray = Task3.removeOddElementsSorted(arr);
        int[] finalSortedTestArray = {-6, -4, -2, 0, 2, 4, 8, 12, 24};
        for(int i = 0; i< resultedArray.length; i++)
        {
            assertEquals(finalSortedTestArray[i], resultedArray[i]);
        }
    }


}