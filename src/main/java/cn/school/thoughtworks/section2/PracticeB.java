package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String,Integer> res = new HashMap<String,Integer>();
        //calculate
        for(int i=0;i<collection1.size();i++){
            String key = collection1.get(i);
            int counter = 1;
            if(key.length()>1) {
                key = key.replaceAll("[^\\w*]", "");
                counter = new Integer(key.substring(1));
                key = key.substring(0, 1);

            }
            counter = res.containsKey(key) ? res.get(key) + counter : counter;
            res.put(key,counter);
        }
        return res;
    }
}
