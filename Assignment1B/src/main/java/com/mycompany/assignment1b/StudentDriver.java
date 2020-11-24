package com.mycompany.assignment1b;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerard
 */

//its not reading in the info from the other packages for some reason
//so I copied the code from the other modules and just added them to this project to try to get it to work
import com.mycompany.assignment1.Student;
import com.mycompany.assignment1.Module;
import com.mycompany.assignment1.CourseProgram;
import org.joda.time.DateTime;

//create the courses, modules and student names.
public class StudentDriver {
   private static CourseProgram Business, IT, Science, Maths;
   private static Module BS101, IT201, SC301, MA401;
   private static Student Paul, Bob, David, Shane;
   
   //create main method to run and have the methods within it to print out and lsit modules etc
   public static void main(String[] args){
       createCourses();
       createModules();
       addCourses();
       registerStudents();
       
       listModules(Business);
       listModules(IT);
       listModules(Science);
       listModules(Maths);
       
       studentInformation(Paul);
       studentInformation(Bob);
       studentInformation(David);
       studentInformation(Shane);  
       
   }


   //create course and add info copy paste from studenttest class
       private static void createCourses(){
            Business = new CourseProgram("BS1", 28, 8, 2019, 30, 6, 2020);
            IT = new CourseProgram("IT1", 28, 8, 2019, 30, 6, 2020);
            Science = new CourseProgram("SC1", 28, 8, 2019, 30, 6, 2020);
            Maths = new CourseProgram("MA1", 28, 8, 2019, 30, 6, 2020);
       }
       
       //create module and add info copy paste from studenttest class
       private static void createModules(){
            BS101 = new Module("Business Studies", "BS1");
            IT201 = new Module("Information Technology", "IT1");
            SC301 = new Module("General Science", "SC1");
            MA401 = new Module("statistics", "MA1");
       }
       
       //add modules to the courses 
       private static void addCourses(){
            Business.addModules(BS101);
            IT.addModules(IT201);
            Science.addModules(SC301);
            Maths.addModules(MA401);
       }
       
       //add student info to the course
       private static void registerStudents(){
            Paul = new Student("PaulSmith", 23, 4, 2000, Business);
            Bob = new Student("BobMarley", 10, 6, 2000, IT);
            David = new Student("DavidMeaney", 1, 5, 2000, Science);
        Shane = new Student("ShaneRoss", 18, 7, 2000, Maths);           
       }
       
       //list courses and modules
        private static void listModules(CourseProgram course) {
        System.out.println("Course Code: " + course.getCode() + "\n Registered Modules:");
        for(Module listElement : course.getModuleList()){
            System.out.print(listElement.getModuleName() + "\n");
        }
        System.out.println("\n");
    }

    private static void studentInfo(Student student){
        System.out.println("Student Name: " +student.getName()+ "\n Student Username: " +student.getUsername());
        System.out.println("Registered Course: " +student.getCourse().getCode());
        System.out.println("Registered Modules:");
        for(Module listElement : student.getModules()){
            System.out.print(listElement.getModuleName() + "\n");
        }
      

    }
       
   }
   
   
   
   

