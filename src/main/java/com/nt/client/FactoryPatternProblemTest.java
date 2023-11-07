package com.nt.client;

import com.nt.comps.AadharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		AadharDetails details=new AadharDetails(30,828283374L,83839393L);
        Student st=new Student("raja","hyd",details,1001,"java");
        System.out.println(st);
        
        System.out.println("+++++++++++");
        AadharDetails details1=new AadharDetails(29,208383838L, 903344443L);
        Person per=new Employee("rani", "hyd", details1, 1002, "Manager");
        System.out.println(per);
	}

}
