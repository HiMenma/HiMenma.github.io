package basic.array;

import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void testMatrix(){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int[] ints : matrix) {
            System.out.printf(Arrays.toString(ints));
        }
    }
}
