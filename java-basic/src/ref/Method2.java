package ref;

public class Method2 {

    public static void main(String[] args) {

        Student student1    = new Student();
        student1.name       = "홍길동";
        student1.grade      = 1;
        student1.age        = 20;


        Student student2    = new Student();
        student2.name       = "홍길동";
        student2.grade      = 1;
        student2.age        = 20;

        printStduent(student1);

    }
    static Student createStudent(String name, int grade, int age) {
        Student student = new Student();
        student.name = name;
        student.grade = grade;
        student.age = age;
        return student;
    }
    private static void printStduent(Student student1) {
        System.out.println("student1.name = " + student1.name);
        System.out.println("student1 = " + student1.age);
    }
}
