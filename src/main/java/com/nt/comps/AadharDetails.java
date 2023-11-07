//Dependent class
package com.nt.comps;

public class AadharDetails {
	private int age;
	private long aadharNo;
	private long mobileNo;
	
	//alt+Shift+s,o to create parameterized constructor
	public AadharDetails(int age, long aadharNo, long mobileNo) {
		System.out.println("AadharDetails.AadharDetails()");
		this.age = age;
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
	}
	 //alt+shift+s,s to override tostring method
	@Override
	public String toString() {
		return "AadharDetails [age=" + age + ", aadharNo=" + aadharNo + ", mobileNo=" + mobileNo + "]";
	}
	
    
	
	
	 

}
