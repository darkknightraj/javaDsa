import java.util.*;

public class SortByHeight {
    public static void main(String[] args) {
        // Sample input
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        
        // Combine names and heights into a list of pairs
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            pairs.add(new Pair(names[i], heights[i]));
        }
        
        // Sort the pairs by height in descending order
        pairs.sort((a, b) -> Integer.compare(b.height, a.height));
        
        // Extract the sorted names
        List<String> sortedNames = new ArrayList<>();
        for (Pair pair : pairs) {
            sortedNames.add(pair.name);
        }
        
        // Output the result
        System.out.println(sortedNames);
    }
    
    // Helper class to store name and height pairs
    static class Pair {
        String name;
        int height;
        
        Pair(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}
