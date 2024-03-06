import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Set<Integer> filledHashSet = getFilledHashSet();

        
        Integer element = 10;
        Set<Integer> setWithSameType = new HashSet<>(filledHashSet);
        setWithSameType.add(element);

        
        boolean containsElement = setWithSameType.contains(element);
        System.out.println( containsElement);
    }

    
    public static Set<Integer> getFilledHashSet() {
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(101);
        set.add(102);
        return set;
    }
}