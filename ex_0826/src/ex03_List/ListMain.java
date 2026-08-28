package ex03_List;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();

        list.add(100);
        list.add(150);
        list.add(50);

        System.out.println(list.size());
        System.out.println(list);
    }
}
