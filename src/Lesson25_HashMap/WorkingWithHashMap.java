package Lesson25_HashMap;

import java.util.HashMap;

public class WorkingWithHashMap {
    /**
     * HashMap implements the Map interface (need import)
     * HashMap is similar to ArrayList, but with key-value pairs
     * store objects, need to use Wrapper Class (Integer, Boolean, Double, etc...)
     * ex: (name, email), (username, userID), (country, capital)
     * 
     */
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        // add a key & value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        // REMOVES KEY
        // countries.remove("USA");
        // RETURNS VALUE
        // System.out.println(countries.get("Russia"));
        // CLEARS HASHMAP (EMPTY)
        // countries.clear();
        // RETURNS SIZE
        // System.out.println(countries.size());
        // REPLACES VALUE OF KEY
        // countries.replace("USA", "Detroit");
        // RETURNS BOOLEAN ON KEY
        // System.out.println(countries.containsKey("England"));
        // RETURNS BOOLEAN ON VALUE
        // System.out.println(countries.containsValue("Beijing"));
        // RETURNS HASHMAP
        // System.out.println(countries);

        // ENHANCED FOR LOOP FOR PRINTING HASHMAP IN FORMAT
        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }
    }

}
