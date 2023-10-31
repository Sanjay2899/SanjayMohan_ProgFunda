package com.gradedproject.q1;

public class Main {

	public static void main(String[] args) {
		AdminDepartment Ad=new AdminDepartment();
		System.out.println("Welcome to "+Ad.departmentName());
		System.out.println(Ad.getTodaysWork());
		System.out.println(Ad.getWorkDeadline());
		System.out.println(Ad.isTodayAHoliday());
		System.out.println();
		HrDepartment Hr=new HrDepartment();
		System.out.println("Welcome to "+Hr.departmentName());
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println(Hr.isTodayAHoliday());
		System.out.println();
		TechDepartment Tech=new TechDepartment();
		System.out.println("Welcome to "+Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println(Tech.isTodayAHoliday());
		
		

	}

}
