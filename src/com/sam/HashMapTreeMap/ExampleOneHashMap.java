package com.sam.HashMapTreeMap;

import java.util.HashMap;

public class ExampleOneHashMap {
    public void exampleOne() {

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "C");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);

        // remove element associated with key 2

        String value = languages.remove(3);
        System.out.println("Removed value: " + value);
        System.out.println("Updated HashMap: " + languages);
    }
}

