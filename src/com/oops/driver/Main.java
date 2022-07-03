package com.oops.driver;
import com.oops.superclass.SuperDepartment;
import com.oops.subclass.AdminDepartment;
import com.oops.subclass.HrDepartment;
import com.oops.subclass.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		SuperDepartment sup = new SuperDepartment ();
		
		AdminDepartment admin=new AdminDepartment();
			admin.departmentName();
			admin.getTodaysWork();
			admin.getWorkDeadline();
			sup.isTodayAHolliday();
			System.out.println();
			
		HrDepartment hr = new HrDepartment();
			hr.departmentName();
			hr.doActivity();
			hr.getTodaysWork();
			hr.getWorkDeadline();
			sup.isTodayAHolliday();
			System.out.println();
			
		TechDepartment tech=new TechDepartment();
			tech.departmentName();
			tech.getTodaysWork();
			tech.getWorkDeadline();
			tech.getTechStackInformation();
			sup.isTodayAHolliday();
		
	}

}
