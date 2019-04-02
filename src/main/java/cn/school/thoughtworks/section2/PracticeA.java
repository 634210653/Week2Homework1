package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //result
        Map<String,Integer> res = new HashMap<String,Integer>();
       //calculate
        for(int i=0;i<collection1.size();i++){
            String str = collection1.get(i);
            int counter = res.containsKey(str)? res.get(str)+1 :1;
            res.put(str, counter);
        }
        return res;
    }
}
