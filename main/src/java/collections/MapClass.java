package main.src.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    public static void main(String[] args) {
        Map<String, Integer> studentDetails = new HashMap<>();

        studentDetails.put("Karthik", 377);
        System.out.println(studentDetails.get("Karthik"));
        if(studentDetails.containsKey("Naveen")){
            System.out.println("Map contains the data required");
        }else {
            System.out.println("No data available");
        }

    }


}


/*
* https://stackoverflow.com/questions/14421121/java-difference-between-a-collection-and-data-structure#:~:text=A%20data%20structure%20is%20a,just%20a%20group%20of%20objects.
* https://stackoverflow.com/questions/1348199/what-is-the-difference-between-the-hashmap-and-map-objects-in-java
*
*
*
*
*
*
*
*
*
* */