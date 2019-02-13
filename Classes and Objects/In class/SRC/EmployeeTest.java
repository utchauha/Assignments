class EmployeeTest
{
	public static void main(String args[])
	{
		double s1,i1,s2,i2;
	
	Employee E1= new Employee("Utkarsh", "Chauhan", 50000);
	Employee E2= new Employee("Saurabh", "Sharma", 6352);
	E1.display();
	E2.display();
	s1=E1.yearlysalary();
	s2=E2.yearlysalary();
	i1=E1.raiseinsalary();
	i2=E2.raiseinsalary();
	System.out.println("salary of employee 1 is" +s1);
	System.out.println("salary of employee 1 is" +s2);
	System.out.println("Incremented salary of employee 1 is" +i1);
	System.out.println("incremented salary of employee 2 is" +i2);
	}

}