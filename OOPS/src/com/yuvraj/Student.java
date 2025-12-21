package com.yuvraj;

import java.util.Scanner;

public class Student {
    int rno;
    String name;
    float per;

    Student(){
//        this.rno = 68;
//        this.name = "Yuvraj";
//        this.per = 87.7f;
    }
    Student(int rno, String name, float per){
        this.rno = rno;
        this.name = name;
        this.per = per;
    }

    public static void main(String[] args) {
        int rno;
        String name;
        float per;
        Student student[] = new Student[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Students : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Roll No : ");
            rno = sc.nextInt();

            System.out.println("Enter Name : ");
            name = sc.next();

            System.out.println("Enter Percentage : ");
            per = sc.nextFloat();

            student[i] = new Student(rno, name, per);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" \nStudent : "+(i+1)+" Details\n");
            System.out.println(student[i].rno+" "+student[i].name+" "+student[i].per);
        }

    }

}
