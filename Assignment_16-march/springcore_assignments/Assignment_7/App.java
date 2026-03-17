package Assignment5_Spring.springcore_assignments.Assignment_7;

public class App {
    
}
package cg.demos.springcore_assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import cg.demos.springcore_assignments.beans.Employee;
import cg.demos.springcore_assignments.beans.SBU;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("configurations.xml");
    	SBU s1 = (SBU) ac.getBean("sbu1");
    	s1.displaySbuDetails();

    }
}
