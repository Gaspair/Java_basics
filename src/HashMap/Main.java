package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<String, String> countries = new HashMap<String, String>();


        countries.put("USA", "WashingtonDC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");


//        countries.remove("USA");

//        System.out.println(countries.get("India"));
//    countries.clear();
//        countries.replace("USA", "Detroit");
//        System.out.println(countries.containsKey("England"));
//        System.out.println(countries.size());
//        System.out.println(countries);


        for(String i:countries.keySet()){
            System.out.print(i + "\t"+ "= ");
            System.out.println(countries.get(i));
        }
    }


}
