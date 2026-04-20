
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PracticeTest {

    
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

    @Test
    void testMaxDiffPositiveAndNegativeTestTwo(){
        //arange 
        int[] numbers ={3, 9, 10, -5};
        // act 
        int actual = Practice.maxDiff(numbers);
        //assert
        assertEquals(15, actual);
    }
    

    // 

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
        int actual = Practice.WordCounter(set, 3, 4);

        //assert
        assertEquals(0, actual);
    }
    

    @Test 
    void testDifferenceMapValues(){
        //arrange
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        //act 
        int actual = Practice.differenceMapValues(map);
        //assert
        assertEquals(1, actual);
    }

    @Test 
    void testSecondLargestKeys(){
        //arrange
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10,"a");
        map.put(3,"b");
        map.put(7, "d");

        //act 
        int actual = Practice.secondLargestKeys(map);

        //assert
        assertEquals(7, actual);
    }
}


