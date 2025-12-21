package com.yuvraj.StaticExample;

public class Employee {
    int empid;
    String ename;
    float sal;
    static  String company = "Mindstix";

    public Employee(int empid, String ename, float sal) {
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001,"David",70000f);
        System.out.println(emp1.empid+" | "+emp1.ename+" | "+emp1.sal+" | "+company);

        Employee emp2 = new Employee(1002,"Marcus",95000f);
        System.out.println(emp2.empid+" | "+emp2.ename+" | "+emp2.sal+" | "+company);
    }
}



