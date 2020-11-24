/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.*;

/**
 *
 * @author Gerard
 */


public class Student{
    private String name;
    private int age;
    private DateTime DOB;
    private String username;
    private CourseProgram courseName;
    private List<Module> modules = new ArrayList<Module>();
    
   
public Student(String name, int day, int month, int year, CourseProgram course){

    this.name = name;
    this.DOB = new DateTime(year, month, day, 0, 0); //formate date of birth 
    this.age = setAge(); //method to get students age from dob
    this.courseName = course;
    registerCourse(); //method to register for course
}

//Getters and Setters
private int setAge() {
    DateTime agenow = new DateTime();
    agenow = DOB.minusYears(agenow.getYear()); //calcualte students age bu taking the current year from date of birth
    return agenow.getYear();
    
}

//method of concatenating students username using their name and age
public String getUsername(){
    username = name + Integer.toString(age);
    return username;
}


private void registerCourse() {
    modules = this.courseName.getModuleList();
    this.courseName.addStudentCourse(this);
    
}


public String getName(){
    return name;
}

public int getAge(){
    return age;
    }

public DateTime getDOB(){
    return DOB;
}

public CourseProgram getCourse(){
    return courseName;
}

public List<Module> getModules(){
    return modules;
}

}