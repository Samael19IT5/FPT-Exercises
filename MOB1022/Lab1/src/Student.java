import java.util.Scanner;

public class Student extends Person {
    private int mark;
    private String grade;

    public Student() {
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void calGrade() {
        if (mark >= 8) {
            grade = "distinction";
        } else if (mark >= 7) {
            grade = "credit";
        } else if (mark >= 5) {
            grade = "pass";
        } else if (mark >= 0) {
            grade = "fail";
        }
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mark: ");
        setMark(Integer.parseInt(scanner.nextLine()));
        calGrade();
    }

    public void display() {
        super.display();
        System.out.println("Mark: " + getMark());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        Person student = new Student();
        student.input();
        student.display();
    }
}
