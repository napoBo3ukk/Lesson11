package Lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson14 {
    public Integer[] convertArray (Integer... intArray) {
        if (intArray == null || intArray.length == 0){
            throw new RuntimeException("The array is null");
        }
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, intArray);
        if (!list.contains(4)) {
            throw new RuntimeException("The array does not have 4");
        }
        int lastIndex4 = list.lastIndexOf(4);
        List<Integer> result;
        result = list.subList(lastIndex4 + 1, list.size());
        Integer[] a = new Integer[result.size()];
        return result.toArray(a);
    }

    public boolean checkArray (Integer...intArray){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, intArray);
        if (!(list.contains(1) && list.contains(4))){
            return false;
        }
        while (list.contains(1)) {
            list.remove((Integer) 1);
        }
        while (list.contains(4)) {
            list.remove((Integer) 4);
        }
        return !(list.size() > 0);
    }
}
