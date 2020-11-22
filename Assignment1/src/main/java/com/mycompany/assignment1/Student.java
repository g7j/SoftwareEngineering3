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
    private String DOB;
    private String username;
    private String course;
    private String module;
    
    
    //set id number as incremental number starting off at 12345678
private static int incrementalCounter = 12345678;
private int idNum;

//main class
public Student(String name, int age, String DOB, String username, String course, String module){
this.name = name;
this.age = age;
this.DOB = DOB;
this.username = username;
this.course = course;
this.module = module;

incrementIDNum();
incrementCounter++;
}

//Getters and Setters
public String getName(){
    return this.name;
}
public int getAge(){
    return this.age;
}

public String getDOB(){
    return this.DOB;
}


public static void incrementIDNum(){
    setIDNum(incrementCounter);    
}

public int getIDNum(){
    return this.idNum;
}

public void setIDnum(int idNum){
    this.idNum = idNum;
}


public String geUsername(){
    return this.username;
}

public String getCourse(){
    return this.course;
}

public String getModule(){
    return this.module;
}

//Setters


}