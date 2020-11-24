/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerard
 */

import com.mycompany.assignment1.Student;
import com.mycompany.assignment1.Module;
import com.mycompany.assignment1.CourseProgram;
import org.joda.time.DateTime;

public class StudentDriver {
   private static CourseProgram Business, IT, Science, Maths;
   private static Module BS101, IT201, SC301, MA401;
   private static Student Paul, Bob, David, Shane;
   
   public static void main(String[] args){
       createCourses();
       createModules();
       addCourses(0);
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


   
       private static void createCourses(){
            Business = new CourseProgram("BS1", 28, 8, 2019, 30, 6, 2020);
            IT = new CourseProgram("IT1", 28, 8, 2019, 30, 6, 2020);
            Science = new CourseProgram("SC1", 28, 8, 2019, 30, 6, 2020);
         Maths = new CourseProgram("MA1", 28, 8, 2019, 30, 6, 2020);
       }
       
       private static void createModules(){
            BS101 = new Module("Business Studies", "BS1");
            IT201 = new Module("Information Technology", "IT1");
            SC301 = new Module("General Science", "SC1");
            MA401 = new Module("statistics", "MA1");
       }
       
       private static void addCourses(){
            Business.addModules(BS101);
            IT.addModules(IT201);
            Science.addModules(SC301);
            Maths.addModules(MA401);
       }
       
       private static void registerStudents(){
            Paul = new Student("PaulSmith", 23, 4, 2000, Business);
            Bob = new Student("BobMarley", 10, 6, 2000, IT);
            David = new Student("DavidMeaney", 1, 5, 2000, Science);
            Shane = new Student("ShaneRoss", 18, 7, 2000, Maths);           
       }
       
        private static void listModules(CourseProgramme course) {
        System.out.println("Course Code: " + course.getCourseCode() + "\nModules Registered for:");
        for(Module listElement : course.getModuleList()){
            System.out.print(listElement.getModuleName() + "\n");
        }
        System.out.println("\n");
    }

    private static void studentInfo(Student student){
        System.out.println("NUIG Student Info: See Details Below");
        System.out.println("Student Name: " +student.getStudentName()+ "\nStudent Login Username: " +student.getUsername());
        System.out.println("Registered Course: " +student.getCourse().getCourseCode());
        System.out.println("Registered Modules:");
        for(Module listElement : student.getModules()){
            System.out.print(listElement.getModuleName() + "\n");
        }
        System.out.println("\n");

    }
       
   }
   
   
   
   

