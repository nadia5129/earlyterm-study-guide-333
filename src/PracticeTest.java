
import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve

    @Test 
    void testlongestArrayList(){
        //arrange
        ArrayList<String> list = new ArrayList<>();
        list.add("yellow");
        list.add("red");

        //act
        String actual = Practice.longestArrayList(list, 'y');

        //assert
        assertEquals("yellow", actual);
    }


    @Test 
    void testWordCounter(){
        //arange
        HashSet<String>set = new HashSet<>();
        set.add("cat");
        set.add("dog");

        //act 
        int actaul = Practice.WordCounter(set, 3, 4);

        //assert
        assertEquals(3,actual);
    }
    
}


