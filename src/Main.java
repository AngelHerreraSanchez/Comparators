import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 9, 14));
        students.add(new Student("Bob", 10, 15));
        students.add(new Student("Charlie", 12, 17));

        Comparator<Student> gradeComparator = (e1, e2) -> Double.compare(e2.grade, e1.grade);
        students.sort(gradeComparator);
        System.out.println(students);

        List<Age> ages = new ArrayList<>();
        ages.add(new Age("Alice", 9, 14));
        ages.add(new Age("Bob", 10, 15));
        ages.add(new Age("Charlie", 12, 17));

        Comparator<Age> ageComparator = (e2, e1) -> Double.compare(e1.age, e2.age);
        ages.sort(ageComparator);
        System.out.println(ages);

    }
}
