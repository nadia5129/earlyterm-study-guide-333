import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int min = nums[0];
        int max= nums[0];

        for( int i = 0; i < nums.length; i++){
            if(nums [i] < min){
                min = nums[i];
            }
            if(nums [i] > max){
                max = nums[i];
            }
            
        }
        return max - min;
    }


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    //Find the longest word that starts with a specific character letter in a arrayList:

    public static String longestArrayList(ArrayList<String> list, char letter){
        String longest = "";

        for(int i =0; i < list.size(); i++){
            String word = list.get(i);

            if (word.charAt(0) == letter && word.length()> longest.length()){
                longest =word;
            }
        }
        return longest;
    }


    //Count how many words are longer than n characters and shorter than m characters in a hashset:

       public static int WordCounter(HashSet<String> set, int n, int m) {
        int count = 0;
        for (String word : set) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }
        return count;
    }
}


//Find the difference between the how many odd and even numbers there are in HashMap value
public static int differenceMapValues(HashMap<String, Integer> map) {
    int odd = 0;
    int even = 0;

    for (int value : map.values()) {
        if (value % 2 == 0) {
            even++;
        } else {
            odd++;
        }
    }
    return odd - even;
}



