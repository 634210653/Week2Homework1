package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //create return collection
        List<String> returnCollection = new ArrayList<String>();
        //get the same element
        for(String str : collection1 ){
            if(collection2.contains(str)){
                returnCollection.add(str);
            }
        }
        return returnCollection;
    }
}
