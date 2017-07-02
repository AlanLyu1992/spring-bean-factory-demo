 package com.alanlyu.springdemo;

public class Organization {
	private String companyName;
	private int yearOfIncorporation;
	
	public Organization(){
		
	}
	public void corporateSlogan(){
		String slogan = "We build the ultimate driving machines!";
		System.out.println(slogan);
	}
	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorpotation=" + yearOfIncorporation + "]";
	}

	public Organization(String companyName, int yearOfIncorpotation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorpotation;
	}
	
	
}
