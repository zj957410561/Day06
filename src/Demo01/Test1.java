package Demo01;

public class Test1 {
    public static void main(String[] args) {
        // 创建一个员工对象
        Employee emp = new Employee();
        // Employee() ： 当前Employee这个类的【构造方法】就是为了创建对象的
        emp.age = 23;
        emp.name = "admin";
        emp.info();
        System.out.println(emp.age);


        //  创建新的对象
        // this 就是当前类的对象
        Employee employee = new Employee();
    }
}
