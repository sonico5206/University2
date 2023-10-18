import java.util.HashSet;
import java.util.Set;

public class ProgrammingTest {
    public ProgrammingTest() {
    }

    public static void main(String[] args) {
        Academic[] academics = new Academic[]{new Academic("Paul Deitel"), new Academic("Cay Horstmann")};
        Student[] students = new Student[]{new Postgraduate("Ivanov", "te2", "bsu.by"), new Postgraduate("Ivanov", "te2", "bsu.by")};
        ((Postgraduate)students[0]).setSupervisor(academics[0]);
        ((Postgraduate)students[1]).setSupervisor(academics[1]);
        Set<Student> set = new HashSet();
        set.add(students[0]);
        ((Postgraduate)students[1]).setSupervisor(academics[0]);
        set.add(students[1]);
        System.out.println(set);
    }
}