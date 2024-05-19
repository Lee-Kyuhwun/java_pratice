package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;

        student1 = new Student();
        student1.name = "학생1";
        student1.score = 90;
        student1.age = 15;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.score = 85;
        student2.age = 16;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
        for(Student student : students) {
            student.print();
        }

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
        }
        for (Student student : students) {
student.print();
        
        }


        System.out.println("student1.name = " + student1.name);
        System.out.println("student2.name = " + student2.name);
        System.out.println("student1.name = " + student1.name);


    }
}
