import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RNG {
    
    List<Integer> numbers = new ArrayList<>(8);
    
    public void init() {
        numbers = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
            numbers.add(i);
        }
    }
    
    public int[] gen() {
        
        int[] numbersArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            numbersArray[i] = numbers.get(i);
        }

        return numbersArray;
    }
    
    public void randinit() {
        Collections.shuffle(numbers);
    }
}