package com.oops.subclass;

import com.oops.superclass.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public void departmentName () {
		System.out.println("Welcome to Hr Department");
	}
	public void getTodaysWork () {
		System.out.println( "   Fill today's worksheet and mark your attendance");
	}
	public void getWorkDeadline () {
		System.out.println( "   Complete by EOD ");
	}
	public void doActivity () {
		System.out.println( "   team Lunch ");
	}
	
}
