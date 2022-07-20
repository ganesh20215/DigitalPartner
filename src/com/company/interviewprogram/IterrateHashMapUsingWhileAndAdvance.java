package com.company.interviewprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterrateHashMapUsingWhileAndAdvance {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ganesh");
        map.put(2, "Suresh");
        map.put(3, "Dinesh");
        System.out.println(map.size());

        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry m = (Map.Entry) itr.next();
            System.out.println("Key is " + m.getKey() + "Value is " + m.getValue());
        }
        for (Map.Entry m2 : map.entrySet()){
            System.out.println("Key is ");
        }
    }
}
