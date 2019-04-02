package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //copy new an one
        HashMap<String,Integer> res = new HashMap<String,Integer>();
        res.putAll(collectionA);
        //main operation
        List<String> strs = object.get("value");
        for(String str : strs ){
            if (res.containsKey(str)) {
                int counter = res.get(str) - 1;
                res.put(str,counter);
            }
        }
        return res;
    }
}
