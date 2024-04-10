package com.java.inner;

class University {
	private static String universityName = "kalasalingam University";

	static class Department {
		private String departmentName;

		public Department(String departmentName) {
			super();
			this.departmentName = departmentName;
		}

		public void display() {
			System.out.println("University Name:" + universityName);
			System.out.println("Department Name:" + departmentName);

		}
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University.Department dept = new University.Department("CSE");
		dept.display();

	}

}
