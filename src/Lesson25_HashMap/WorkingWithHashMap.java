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

        // countries.remove("USA");
        // System.out.println(countries.get("Russia"));
        // countries.clear();
        // System.out.println(countries.size());
        // countries.replace("USA", "Detroit");
        // System.out.println(countries.containsKey("England"));
        // System.out.println(countries.containsValue("Beijing"));
        // System.out.println(countries);

        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }
    }

}
