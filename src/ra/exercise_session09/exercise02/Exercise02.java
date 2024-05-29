package ra.exercise_session09.exercise02;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("An");
        listString.add("Bích");
        listString.add("Thủy");

        for (int i = 0; i < listString.size(); i++) {
            if(listString.get(i).length() > 3) {
                System.out.println("Chuỗi có độ dài lớn hơn 3 ký tự là: " + listString.get(i));
            }
        }
    }
}
