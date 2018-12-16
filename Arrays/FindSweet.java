import java.util.*;

public class FindSweet{

    
    // Program to find string with max repetition count and if 
    // same by alphabetical order
    
    
    public static String getMySweet(List<String> sweets)
    {
        System.out.println("Given sweets length is " + sweets.size());
        
        Map<String, Integer> voteMap = new TreeMap<>(); // To sort by key names
        
        for(String sweet : sweets)
        {
            
            if(voteMap.containsKey(sweet))
              voteMap.put(sweet, voteMap.get(sweet)+1);
            else
              voteMap.put(sweet, 1);
        }
        
        System.out.println("Map is " + voteMap);
        
        int maxVoteCount = 1; 
        String finalSweet = null;
        
        for(Map.Entry<String, Integer> entry : voteMap.entrySet())
        {
            if(entry.getValue() >= maxVoteCount)
            {
                finalSweet = entry.getKey();
                maxVoteCount = entry.getValue();
            }
        }

        return finalSweet;       
    }
    
    public static void main(String []args){
        System.out.println("Hello World");
        
        List<String> sweets = new ArrayList<>();
        sweets.add("GulabJam");
        sweets.add("GulabJam");
        sweets.add("Jangri");
        sweets.add("Jangri");
        sweets.add("MysorePak");
        sweets.add("Laddu");
        sweets.add("GulabJam");
        sweets.add("Laddu");
        sweets.add("Palakova");
        
        String requiredSweet = getMySweet(sweets);
        
        System.out.print(requiredSweet);
        
        
    }
}
