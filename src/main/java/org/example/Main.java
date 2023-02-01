package org.example;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("John",'B',1);
        System.out.println("Name: " + student1.getName());
        System.out.println("Grade: " + student1.getGrade());
        System.out.println("Group: " + student1.getGroup());

        student1.upgradeGrade();
        System.out.println("Upgraded grade: " + student1.getGrade());
        student1.downgradeGrade();
        System.out.println("Downgraded grade: " + student1.getGrade());

        Student student2=new Student("Raaz",'E',5);
        System.out.println("Name: " + student2.getName());
        System.out.println("Grade: " + student2.getGrade());
        System.out.println("Group: " + student2.getGroup());

        student2.downgradeGrade();
        System.out.println("Downgraded grade: " + student2.getGrade());
        //student2.upgradeGrade();
        //System.out.println("Upgraded grade: " + student2.getGrade());


        Student student3=new Student("Sam",'A',4);
        System.out.println("Name: " + student3.getName());
        System.out.println("Grade: " + student3.getGrade());
        System.out.println("Group: " + student3.getGroup());

        student3.upgradeGrade();
        System.out.println("Upgraded grade: " + student3.getGrade());
        student3.downgradeGrade();
        System.out.println("Downgraded grade: " + student3.getGrade());
    }
}