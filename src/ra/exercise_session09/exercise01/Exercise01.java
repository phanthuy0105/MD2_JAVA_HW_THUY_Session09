package ra.exercise_session09.exercise01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<Integer> listPrime = new ArrayList<>();
        listPrime.add(2);
        listPrime.add(3);
        listPrime.add(5);
        listPrime.add(7);
        listPrime.add(17);
        listPrime.add(11);
        listPrime.add(19);

        System.out.println("Các phần tử trong mảng: ");
        for (Integer number : listPrime) {
            System.out.println(number);
        }

        Integer max = Collections.max(listPrime);
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
