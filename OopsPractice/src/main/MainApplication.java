package main;

import com.sample.model.*;

public class MainApplication {
	
	public static void main(String[] args) {
		
		// Object, Constructor, method, inheritance, polymorphism, encapsulation
		
		Address add1 = new Address("bangalore", "karnataka", "india", "123454");
		Address add2 = new Address("bhopal", "madhya pradesh", "india", "212341");
		Address add3 = new Address("pune", "maharastra", "india", "334345");
		Employee emp = new Employee("XYZ Limited", "Bangalore, KA, IND", "IT service", "Software Solution", "Mahesh", "132456", "mahesh@xyz.com", 9009009001l, 45_000,add1);
		emp.work();
		System.out.println(emp.generatePassword());
		System.out.println(emp.generatePassword("Random", 9000000002l));
		emp.buildSoftware();
		System.out.println(emp);
		Employee emp2 = new Employee("XYZ Limited", "Bangalore, KA, IND", "IT service", "Software Solution", "Rahesh", "1342456", "rahesh@xyz.com", 9009009002l, 46_000,add2);
		emp2.work();
		System.out.println(emp2.generatePassword());
		emp2.buildSoftware();
		System.out.println(emp2);
		Employee emp3 = new Employee("XYZ Limited", "Bangalore, KA, IND", "IT service", "Software Solution", "Suresh", "132456", "suresh@xyz.com", 9009009003l, 50_000,add3);
		emp3.work();
		System.out.println(emp3.generatePassword());
		emp3.buildSoftware();
		System.out.println(emp3);
		
		
		System.out.println("=======Abstraction==============");
		ArithmeticOperation op = new ArithmeticOperation();
		System.out.println(op.add(12, 34));
		System.out.println(op.sub(12, 34));
		System.out.println(op.mul(12, 34));
		System.out.println(op.div(25, 5));
		op.printOperation();
		Operation.displayMessage();
	}
}