public class Age{
    String name;
    double grade;
    int age;

    Age(String name, double grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + grade;
    }
}
