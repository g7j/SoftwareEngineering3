/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Gerard
 */

public class Module {
    private String moduleName;
    private String moduleID;
    private List<Student> students = new ArrayList<Student>();
    private List<CourseProgram> courses = new ArrayList<CourseProgram>();

    public Module(String moduleName, String moduleID){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    public void addCourse(CourseProgram course) {
        this.courses.add(course);
    }

    public void addStudentModule(Student student){
        this.students.add(student);
    }
    

    public String getModuleName(){
        return moduleName;
    }
    public String getModuleID(){
        return moduleID;
    }
    public List<Student> getStudentList(){
        return students;
    }
    public List<CourseProgram> getCourseList(){
        return courses;
    }
}
