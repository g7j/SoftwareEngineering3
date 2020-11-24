/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;


//some of these were added by default
import java.util.List;
import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gerard
 */
public class StudentTest {
    
   private CourseProgram Business, IT, Science, Maths;
   private Module BS101, IT201, SC301, MA401;
   private Student Paul, Bob, David, Shane;
   
   @Test
   public void usernameTest() {} {
    Business = new CourseProgram("BS1", 28, 8, 2019, 30, 6, 2020);
    IT = new CourseProgram("IT1", 28, 8, 2019, 30, 6, 2020);
    Science = new CourseProgram("SC1", 28, 8, 2019, 30, 6, 2020);
    Maths = new CourseProgram("MA1", 28, 8, 2019, 30, 6, 2020);
   
    
    BS101 = new Module("Business Studies", "BS1");
    IT201 = new Module("Information Technology", "IT1");
    SC301 = new Module("General Science", "SC1");
    MA401 = new Module("statistics", "MA1");
       
    Business.addModules(BS101);
    IT.addModules(IT201);
    Science.addModules(SC301);
    Maths.addModules(MA401);
    
    Paul = new Student("PaulSmith", 23, 4, 2000, Business);
    Bob = new Student("BobMarley", 10, 6, 2000, IT);
    David = new Student("DavidMeaney", 1, 5, 2000, Science);
    Shane = new Student("ShaneRoss", 18, 7, 2000, Maths);
    
    assertEquals("PaulSmith-23",Paul.getUsername());
    assertEquals("BobMarley-10",Bob.getUsername());
    assertEquals("DavidMeaney-1",David.getUsername());
    assertEquals("ShaneRoss-18",Shane.getUsername());
        
    }  
      
    
}
    
    
    /* all of this was in class by defeault
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getUsername method, of class Student.
     *
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Student instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     *
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     *
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDOB method, of class Student.
     *
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        Student instance = null;
        DateTime expResult = null;
        DateTime result = instance.getDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class Student.
     *
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Student instance = null;
        CourseProgram expResult = null;
        CourseProgram result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class Student.
     *
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        Student instance = null;
        List<Module> expResult = null;
        List<Module> result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
} 
    */

