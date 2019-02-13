
class Employee
{
	String firstname;
	String lastname;
	double salary;
	

	Employee()
	{
		firstname="Utkarsh";
		lastname="Chauhan";
		salary=25000;
		
	}
	Employee(String firstname, String lastname, double salary)
	{
		this .firstname=firstname;
		this .lastname=lastname;
		this .salary=salary;
		
	}
	public String getFirstName()	
	{
		return firstname;
	}

	public String getLastName()
	{
		return lastname;
	}

	public Double getSalary() 
	{
		return salary;
	}
	void setfirstname(String firstname)
	{
		this .firstname=firstname;
	}
	public void setlastname(String lastname)
	{
			this .lastname=lastname;
	}
	public void setsalary(double salary)
	{	if(salary>0)
		{
		this .salary=salary;
		}
	}
	public double yearlysalary()
	{
		salary=salary*12;
		return salary;

	}
	public double raiseinsalary()
	{	 double newsalary;
		newsalary=(0.1*this.salary)+(this.salary);
		return newsalary;
	}
	void display()
	{
		System.out.println("First Name is"+firstname);
		System.out.println("lastname is" +lastname);
		
	}
}






































