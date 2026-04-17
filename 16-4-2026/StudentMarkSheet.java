import java.lang.*;
import java.util.*;

class StudentMarksheet{
    String name;
    int rollNumber;
    int m1,m2,m3;
    int total;
    double average;
    char grade;

    void calculateTotal(){
        total = m1 + m2 + m3;
    }

    void calculateAverage(){
        average = total / 3.0;
    }

    void calculateGrade(){
        if(average >= 90){
            grade = 'A';
        } else if(average >= 80){
            grade = 'B';
        } else if(average >= 70){
            grade = 'C';
        } else if(average >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
}

class StudentMarksheetTest{
    public static void main(String[] args){
        StudentMarksheet student = new StudentMarksheet();
        student.name = "John Doe";
        student.rollNumber = 1;
        student.m1 = 85;
        student.m2 = 92;
        student.m3 = 78;

        student.calculateTotal();
        student.calculateAverage();
        student.calculateGrade();

        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Marks: " + student.m1 + ", " + student.m2 + ", " + student.m3);
        System.out.println("Total: " + student.total);
        System.out.println("Average: " + student.average);
        System.out.println("Grade: " + student.grade);  
    }
}