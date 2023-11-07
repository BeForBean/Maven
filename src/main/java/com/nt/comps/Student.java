package com.nt.comps;

public class Student extends Person {
	
	private int studid;
	private String course;
	

	public Student(String name, String addrs, AadharDetails aadhar,int  studid,String course) {
		super(name,addrs,aadhar);
		System.out.println("Student::5-param constructor");
		this.studid=studid;
		this.course=course;
	}


	@Override
	public String toString() {
		return "Student [studid=" + studid + ", course=" + course + "]--"+super.toString();
	}
	
	
	
	
	

}
