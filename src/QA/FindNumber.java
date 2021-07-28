package QA;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {
    public static void main(String[] args) {
        int x = 10;
        List<Integer> list = new ArrayList<Integer>();
        while (x < 201) {
            if (x % 7 == 0 && x % 5 != 0) {
                list.add(x);
            }
            x++;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.get(list.size() - 1));
    }
}

