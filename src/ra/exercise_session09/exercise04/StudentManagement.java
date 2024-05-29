package ra.exercise_session09.exercise04;

import java.util.*;

public class StudentManagement {
    List<Student> student = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.inputListStudent(scanner);
        do {
            System.out.println("******************MENU*******************");
            System.out.println("1. Phương thức showall hiển thị tất cả sinh viên");
            System.out.println("2. Phương thức void addStudent(Student student)\n" +
                                "để thêm một sinh viên vào danh sách sinh viên");
            System.out.println("3. Phương thức void removeStudent(int studentId) để xóa sinh viên\n" +
                                "có mã số sinh viên là studentId khỏi danh sách sinh viên");
            System.out.println("3. Phương thức Student findStudentById(int studentId) để tìm kiếm sinh viên\n" +
                                "có mã số sinh viên là studentId và trả về đối tượng Student tương ứng");
            System.out.println("4. Phương thức getAverageScore tính và trả về điểm trung bình\n" +
                                "của tất cả student");
            System.out.println("5. Phương thức sortByScore sắp xếp sinh viên theo điểm tăng dần");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManagement.showall(scanner);
                    break;
                case 2:
                    studentManagement.addStudent(scanner);
                    break;
                case 3:
                    studentManagement.deleteStudent(scanner);
                    break;
                case 4:
                    studentManagement.findStudentById(scanner);
                    break;
                case 5:
                    studentManagement.getAverageScore();
                    break;
                case 6:
                    studentManagement.sortByScore();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-6");
            }
        } while (true);
    }

    public void inputListStudent(Scanner scanner) {
        System.out.println("Nhập vào số danh mục cần nhập thông tin:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Student newStudent = new Student();
            newStudent.inputData(scanner);
            student.add(newStudent);
        }
    }

    public void showall(Scanner scanner) {
        System.out.println("Thông tin sinh viên");
        for (Student element : student) {
            element.displayData();
        }
    }

    public void addStudent(Scanner scanner) {
        System.out.println("Thêm mới một sinh viên:");
        Student newStudent = new Student();
        newStudent.inputData(scanner);
        student.add(newStudent);
    }

    public int getIndexByCatalogId(int studentId) {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    public void deleteStudent(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên cần xóa:");
        int studentIdDelete = Integer.parseInt(scanner.nextLine());
        int indexDelete = getIndexByCatalogId(studentIdDelete);
        if (indexDelete >= 0) {
            student.remove(indexDelete);
        } else {
            System.err.println("Mã sinh viên không tồn tại, vui lòng nhập lại");
        }
    }

    public void findStudentById(Scanner scanner) {
        System.out.println("Tìm kiếm sinh viên theo mã sinh viên: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        boolean isSearch = false;
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getStudentId() == studentId) {
                isSearch = true;
                student.get(i).displayData();
                break;
            }
        }
        if (!isSearch) {
            System.err.println("Mã sinh viên không tồn tại, vui lòng nhập lại");
        }
    }

    public void getAverageScore() {
        System.out.println("Điểm trung bình của sinh viên");
        for (int i = 0; i < student.size(); i++) {
            student.get(i).averageScore();
        }
    }

    public void sortByScore() {
        Collections.sort(student, Comparator.comparingDouble(Student::getAverageScore));
        System.out.println("SẮP XẾP THEO ĐIỂM TĂNG DẦN VỚI COMPARATOR:");
        for (Student element : student) {
            element.displayData();
        }
    }
}
