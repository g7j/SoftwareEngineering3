/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 *
 * @author Gerard
 */


public class CourseProgram{
    private String code;
    private List<Student> students = new ArrayList<Student>();
    private List<Module> modules = new ArrayList<Module>();
    private DateTime startDate;
    private DateTime finishDate;
    
    
    //details for course
    public CourseProgram(String code, int startDay, int startMonth, int startYear, int finishDay, int finishMonth, int finishYear){
        this.code = code;
        this.startDate = new DateTime(startYear, startMonth, startDay, 0 ,0); 
        this.finishDate = new DateTime(finishYear, finishMonth, finishDay, 0, 0);
    }
    
    //method to add modules
    public void addModules(Module module){
        this.modules.add(module);
        module.addCourse(this);
    }
    
    //add student to module
    public void addCourse(Student student){
        this.students.add(student);
        for(Module listElement : modules){
            listElement.addModule(student);
        }
    }

    //rest of getters and setters
    public String getCourseCode(){
        return code;
    }
    public List<Student> getStudentList(){        
        return students;
    }
    public List<Module> getModuleList(){        
        return modules;
    }
    public DateTime getStartDate(){
        return startDate;
    }
    public DateTime getFinishDate(){
        return finishDate;
    }
}
