import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student2 {
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

    public static void main(String[] args) {
        List<Student2> stu = new ArrayList<>();
        Student2 s = new Student2();
        s.id = 1;
        s.name = "ravi";
        s.grade = "A";
        s.marks = 95;
       stu.add(s);

        Student2 s1 = new Student2();
        s1.id = 2;
        s1.name = "siri";
        s1.grade = "B";
        s1.marks = 84;
      stu.add(s1);

        Student2 s2 = new Student2();
        s2.id = 3;
        s2.name = "ramu";
        s2.grade = "C";
        s2.marks = 75;
        stu.add(s2);

        Student2 s3 = new Student2();
        s3.id = 4;
        s3.name = "vinu";
        s3.grade = "A";
        s3.marks = 99;
        stu.add(s3);
        Function<Student2,Student2>gradeMap=st->{
            if(st.marks>90){
                st.grade="A";
            }
            return  st;
        };
        Predicate<Student2>gradePredicate=x->x.getGrade().equals("B");
        Consumer<Student2>printConsumer=x-> System.out.println(x.getName());

        Comparator<Student2>supFun=(x,y)-> {
            if (x.getMarks() < y.getMarks()) {

            }

            return -1;
        };
        List<Student2> filteredStudents = stu.stream()
                .map(gradeMap)
             .filter(gradePredicate)
                .sorted(supFun)
                .collect(Collectors.toList());

        filteredStudents.forEach(printConsumer);
    }

    }

