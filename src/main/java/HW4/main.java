package HW4;

import java.util.Collections;
import java.util.LinkedList;

public class main {
    /* Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*/

    // private static LinkedList<String> list;
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        LinkedList<String> list3 = new LinkedList<>();
        Collections.addAll(list, "first", "Stop", "second", "Look", "third", "Listen");
        System.out.println("Дан список:");
        System.out.println(list);
        System.out.println("Перевернутый список:");
        list2 = reverse(list);
        System.out.println(list2);

    }

    private static LinkedList<String> reverse(LinkedList lst) {
        LinkedList<String> lstRev = new LinkedList<>();
        for (int i = lst.size() - 1; i >= 0; i--) {
            lstRev.add((String) lst.get(i));
        }
        return lstRev;
    }


}
