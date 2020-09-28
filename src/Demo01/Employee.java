package Demo01;

import java.util.Objects;

/**
 * 员工类（工号，姓名，性别，年龄）
 * 类成员：
 * 成员属性：成员方法
 * 所有的对象都是由Object类创建出来的
 */
public class Employee {
    String eno;//员工工号
    String name;//员工姓名
    char gender;//员工的性别
    int age; // 员工的年龄

    public Employee(String eno) {
        this.eno = eno;
    }

    // 构造方法重在 有参数 无参数  形参 （用来接受数据的）
    public Employee(String eno, String name, char gender, int age) {
        super(); //  执行了new(Object, 由c语言及硬件对象)
        // 当局部变量名字和成员变量名字一致时，为了区别，我们可以使用this来表示当前对象
        this.eno = eno;
        this.name = name;
        this.gender = gender;
        this.age = age;
        // this 当前类创建出来的这个对象自身（每个类对象都是this）
    }

    // 构造方法 重点 ： 无参构造是
    // 构造方法没有任何返回值类型
    public Employee() {
        // 指的就是employee的父类Object 一定要保证创建真实的对象在进行其他的操作
        super();
        //System.out.println("employ创建的");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return gender == employee.gender &&
                age == employee.age &&
                Objects.equals(eno, employee.eno) &&
                Objects.equals(name, employee.name);
    }

    /**
     * 为了解决赋值过程中的数据格式安全问题：我们可以采用逻辑来人为判断
     * @return
     */
    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 方法重再的概念
     * 前提：所有的重载的方法都需要在【同一个类中】
     * 要点：
     *     同名不同参：方法名相同，但是参数列表不一致（个数，类型，顺序）
     *     与方法的返回类型 无关【构造方法是典型的方法重载】
     */

    // 成员方法
    public void info() {
        System.out.println("我是" + name + "我今年" + age + "岁");
    }


}
