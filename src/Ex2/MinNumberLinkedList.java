package Ex2;

import java.util.Collections;
import java.util.LinkedList;

public class MinNumberLinkedList {

    public static LinkedList<Integer> getIntegerList(int numberElementsOfList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        for (int i = 0; i < numberElementsOfList; i++) {
            resultList.add(((int) (Math.random() * (1000 + 1)) - 100));
        }
        return resultList;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        Collections.sort(list);
        return list.getFirst();
    }


}

