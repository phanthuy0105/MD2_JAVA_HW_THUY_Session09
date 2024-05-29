package ra.learn_session09.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        Dictionary<String, String> dictionary = new Dictionary<>();
        dictionary.setKey("Study");
        dictionary.setValue("Học");
        System.out.printf("Nghĩa của từ %s là %s\n", dictionary.getKey(), dictionary.getValue());
        Book1 book1 = new Book1();
        Book2<Integer> book2 = new Book2<>();
        Book3<Float, Integer, String> book3 = new Book3<>();

        GenericMethod genericMethod = new GenericMethod();
        //Khi làm việc với kiểu dữ liệu Generic thì phải dùng các wrapper Class của các kiểu dữ liệu primitive
        //In ra các phần tử của mảng số nguyên:
        Integer[] arrInt = {1, 3, 5, 7};
        genericMethod.printArray(arrInt);//E: Integer
        //In ra các phần tử mảng số thực
        Float[] arrFloat = {3.5F, -7.9F};
        genericMethod.printArray(arrFloat);//E: Float
        //In ra mảng chuỗi
        String[] arrString = {"Nguyễn Văn A", "Nguyễn Văn B"};
        genericMethod.printArray(arrString);//E: String

        List<Person> listPerson = new ArrayList<>();
        List<Teacher> listTeacher = new ArrayList<>();
        List<Student> listStudent = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        genericMethod.printList(listStudent);
        genericMethod.printList(listTeacher);
        genericMethod.printList(listPerson);
        genericMethod.printList(listInteger);


    }
}