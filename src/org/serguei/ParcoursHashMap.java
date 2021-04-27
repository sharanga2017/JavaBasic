package org.serguei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParcoursHashMap {
	 
    public static void main(String[] args) {

        HashMap<String,Double> map = new HashMap<String,Double>();

        map.put("A",12.0);
        map.put("B",42.1);
        map.put("C",5.6);
        map.put("D",29.7);
        
        
        System.out.println("Boucle for:");
        
        
        for (Map.Entry<String, Double> mapentry : map.entrySet()) {
        	
           System.out.println("clé: "+mapentry.getKey() 
                              + " | valeur: " + mapentry.getValue());
        }

        
        System.out.println("Boucle while");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          System.out.println("clé: "+mapentry.getKey()
                            + " | valeur: " + mapentry.getValue());
        } 
    }
}
