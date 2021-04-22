package org.college;

public class College {

	public void collegeName() {
		System.out.println("Collge name is SRM");
	}
	public void collegeCode() {
		System.out.println("Collge code is s234r567m9");
	}
	public void collgeRank() {
		System.out.println("Collge rank is 12th");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		College c= new College();
		c.collegeName();
		c.collegeCode();
		c.collgeRank();
		
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		
		
		Hostel h= new Hostel();
		h.hostelName();
		
		Dept d= new Dept();
		d.deptName();
		
	}

}
