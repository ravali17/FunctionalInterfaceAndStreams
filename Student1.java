import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student1 {
    int id;
    String name;
    int marks;
    String grade;

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student1> stu = new ArrayList<>();
        Student1 s = new Student1();
        s.id = 1;
        s.name = "ravi";
        s.grade = "A";
        s.marks = 95;
        stu.add(s);

        Student1 s1 = new Student1();
        s1.id = 2;
        s1.name = "siri";
        s1.grade = "E";
        s1.marks = 30;
        stu.add(s1);

        Student1 s2 = new Student1();
        s2.id = 3;
        s2.name = "ramu";
        s2.grade = "C";
        s2.marks = 75;
        stu.add(s2);

        Student1 s3 = new Student1();
        s3.id = 4;
        s3.name = "vinu";
        s3.grade = "A";
        s3.marks = 99;
        stu.add(s3);
        List<Student1> students = stu.stream().map(st -> {
            if (st.getMarks() > 90) {
                st.grade = "A";
            } else if (st.getMarks() > 80 && st.getMarks() < 90) {
                st.grade = "B";
            } else if (st.getMarks() > 60 && st.getMarks() < 80) {
                st.grade = "C";
            } else {
                st.grade = "Fail";
            }
            return st;
        })
               .filter(st -> st.getGrade().equals("A"))
                .collect(Collectors.toList());
        System.out.println(students);


        }
    }

