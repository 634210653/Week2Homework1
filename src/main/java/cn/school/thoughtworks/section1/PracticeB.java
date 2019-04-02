package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //create return collection
        List<String> returnCollection = new ArrayList<String>();
        //get the same element
        for(String str : collection1 ){
            //judge each set
            for(List<String> collection: collection2){
                if (collection.contains(str)) {
                    returnCollection.add(str);
                    break;
                }
            }
        }
        return returnCollection;
    }
}
