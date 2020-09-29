package homwork;

import java.util.Date;

public class Person {
    int num;
    String name;
    String gender;
    int age;
    double height;
    double weight;
    Date birthday;
    String birthplaces;

    public Person() {
        super();
    }

    public Person(int num, String name, String gender, int age, double height, double weight, Date birthday, String birthplaces) {
        this.num = num;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
        this.birthplaces = birthplaces;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthplaces() {
        return birthplaces;
    }

    public void setBirthplaces(String birthplaces) {
        this.birthplaces = birthplaces;
    }

    public void eat() {
        System.out.println("吃");
    }

    public void drink() {
        System.out.println("喝");
    }

    public void pull() {
        System.out.println("拉");
    }

    public void spill() {
        System.out.println("撒");
    }
    public void myself()
    {
        System.out.println("编号"+num+"姓名"+name);
    }
}
