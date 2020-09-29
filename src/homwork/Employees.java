package homwork;

public class Employees {
    Department department;
    String name;

    public Employees() {
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "department=" + department.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}
