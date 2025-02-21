public class Student {
    String name;
    double grade;
    int age;

    Student(String name, double grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + grade;
    }


}

