package org.example;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private static final char[] GRADE_LEVELS={'A','B','C','D','E','F'};
    private static final int NUM_GRADES= GRADE_LEVELS.length;

    private String name;
    private char grade;
    private int group;
    private final String secretNickname="MySecretNickName";


    public Student(String name,char grade,int group) {

        this.name = name;
        this.grade=grade;
        this.group=group;
    }
    public void upgradeGrade() {
        if (grade == 'A') {
            System.out.println("Grade already in high level");
        } else {
            grade--;
        }
    }
    public void downgradeGrade(){
        if(grade=='F'){
            System.out.println("Grade already in low level");
        } else {
            grade++;
        }
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public int getGroup() {
        return group;
    }

    public String getNickname() {
        return this.secretNickname;
    }

}
