package homwork;

public class Department {
    String department;

    public Department() {
    }

    public Department(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department='" + department + '\'' +
                '}';
    }
}
