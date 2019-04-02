package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //calculate
        Map<String,Integer> collection3 = new HashMap<String,Integer>();
        for(int i=0;i<collectionA.size();i++){
            String str = collectionA.get(i);
            int counter = collection3.containsKey(str)? collection3.get(str)+1 :1;
            collection3.put(str, counter);
        }
        //reduce
        return new PracticeB().createUpdatedCollection(collection3,object);
    }
}
