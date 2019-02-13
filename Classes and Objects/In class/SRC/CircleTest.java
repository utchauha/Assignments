class Circle
{	
	double radius;
	double A;
	double C;

	Circle()
	{
		radius=1;	
	}
	Circle(double radius)
	{
		this .radius=radius;
	}
	public double area()
	{	
		
		A=3.14*radius*radius;
		return A;
	}
	public double circumference()
	{	
		
		C=2*3.14*radius;
		return C;
	}
	void display()
	{
		System.out.println("Area is "+A);
		System.out.println("circumference is " +C);
	}
}

	
	class CircleTest
	{
		public static void main(String args[])
		{
		double A1, C1;
		Circle Ci= new Circle(10);
		A1=Ci.area();
		C1=Ci.circumference();
		Ci.display();
		}	


	}




