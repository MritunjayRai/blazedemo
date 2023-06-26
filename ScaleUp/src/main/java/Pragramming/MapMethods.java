package Pragramming;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //adding the key-value pair
        map.put("banana",3);
        map.put("orange",2);
        map.put("Apple",2);
        //access values by key
        int appleQuantity =map.get("Apple");
        System.out.println("quantity of the apple: "+ appleQuantity);
        //check if the key exists in the map
        boolean containsKey = map.containsKey("banana");
        System.out.println("contains banana: "+containsKey);
        //iterate over the kay-value pairs
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            String fruit= entry.getKey();
            int quantity = entry.getValue();
            System.out.println("fruit: "+fruit+" quantity: "+quantity);
            }
        //remove the key-value pair
        map.remove("orange");

        //check the size of the map
        int mapSize= map.size();
        System.out.println("size of the map: "+ mapSize);



    }
}
