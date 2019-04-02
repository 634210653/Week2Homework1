package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {

        String keyWord = "value";
        //create return collection
        List<String> returnCollection = new ArrayList<String>();
        //get the same element
        for(String str : collection1 ){

            if (collection2.get(keyWord).contains(str)) {
                returnCollection.add(str);
            }

        }
        return returnCollection;
    }
}
