package ra.exercise_session09.exercise03;

import ra.learn_session09.collection.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        List<Integer> listPrime = new ArrayList<>();
        listPrime.add(2);
        listPrime.add(3);
        listPrime.add(5);
        listPrime.add(8);
        listPrime.add(20);

        System.out.println("Các phần tử trong mảng: ");
        int sum = 0;
        for (Integer number : listPrime) {
            System.out.println(number);
            sum += number;
        }
        System.out.println("Tổng các số nguyên là: " + sum);
    }
}
