package ra.exercise_session09.exercise04;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private double mathScores;
    private double literatureScores;
    private double englishScores;
    private double averageScore;

    public Student() {
    }

    public Student(int studentId, String studentName, double mathScores, double literatureScores, double englishScores, double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mathScores = mathScores;
        this.literatureScores = literatureScores;
        this.englishScores = englishScores;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getLiteratureScores() {
        return literatureScores;
    }

    public void setLiteratureScores(double literatureScores) {
        this.literatureScores = literatureScores;
    }

    public double getEnglishScores() {
        return englishScores;
    }

    public void setEnglishScores(double englishScores) {
        this.englishScores = englishScores;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên");
        this.studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sinh viên");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập điểm môn Toán");
        this.mathScores = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm môn Văn");
        this.literatureScores = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm môn Anh");
        this.englishScores = Double.parseDouble(scanner.nextLine());
    }

    public void averageScore() {
        this.averageScore = (this.mathScores + this.literatureScores + this.englishScores) / 3;
    }

    public void displayData() {
        System.out.printf("Mã sinh viên: %d - Tên sinh viên: %s - Điểm Toán: %.2f - Điểm Văn: %.2f\n", this.studentId, this.studentName, this.mathScores, this.literatureScores);
        System.out.printf("Điểm Anh: %.2f - Điểm trung bình: %.2f\n", this.englishScores, this.averageScore);
    }
}
