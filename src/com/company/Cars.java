package com.company;

import java.util.*;

public class Cars {

//        You are a car dealer. Create a hash map of vehicles.
//        The model is the Key, the make is the Value.
//        Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//        (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")

//    METHOD
    public static void Dealership() {
//        CREATE HASHMAP WITH KEY: CAR MODEL & VALUES: CAR MAKE
        HashMap<String, List<String>> dealership = new HashMap<>();

        dealership.put("Toyota", new ArrayList<String>(List.of("Yaris", "Corolla", "Camry")));
        dealership.put("Tesla", new ArrayList<String>(List.of("Model 3", "Model X", "Model S", "Model Y")));
        dealership.put("Jeep", new ArrayList<String>(List.of("Wrangler", "Cherokee", "Renegade")));
        dealership.put("Lexus", new ArrayList<String>(List.of("RX 350", "IS 300", "RX Hybrid")));

//        ASK CUSTOMER WHAT CAR THEY WANT
        Scanner input = new Scanner(System.in);
        System.out.println("What car make are you looking for? We have Toyota, Tesla, Lexus, and Jeep.");
        String car = input.nextLine();

        if(dealership.containsKey(car)) {
            System.out.println("A " + car + "! Nice choice. We have these models: ");
            for(String model : dealership.get(car)){
                System.out.println(model);
            }

        } else {
            System.out.println("Take a hike. We don't have those now.");
        }

    }
}
