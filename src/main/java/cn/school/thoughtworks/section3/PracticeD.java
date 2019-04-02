package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
       //count
        Map<String,Integer> collection3 = new HashMap<String,Integer>();
        //calculate
        for(int i=0;i<collectionA.size();i++){
            String key = collectionA.get(i);
            int counter = 1;
            if(key.length()>1) {
                key = key.replaceAll("[^\\w*]", "");
                counter = new Integer(key.substring(1));
                key = key.substring(0, 1);

            }
            counter = collection3.containsKey(key) ? collection3.get(key) + counter : counter;
            collection3.put(key,counter);
        }
        //reduce
        return new PracticeB().createUpdatedCollection(collection3,object);
    }
}
