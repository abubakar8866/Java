package java8Feature;

public class Empl {

    String name;
    Dept department;

    public Empl(String name, Dept department) {
        this.name = name;
        this.department = department;
    }

    public Dept getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}
