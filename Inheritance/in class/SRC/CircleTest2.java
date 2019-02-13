class Circle
{
	double radius;
	String color="red";
	Circle()
	{
		radius=0;
	}
	Circle(double radius)
	{
		this .radius=radius;
	}
	Circle(double radius, String color)
	{
		this.radius=radius;
		this .color=color;
	}
	public double getradius()
	{
		return radius;
	}
	public void setradius(double radius)
	{
		this .radius=radius;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcolor()
	{
		this .color=color;
	}
	public double getarea()
	{
		return (3.14*getradius()*getradius());
	}
}
class Cylinder extends Circle
{
	double height;
	Cylinder()
	{
		height=1;
	}
	Cylinder(double radius)
	{
		super(radius);
	}
	Cylinder(double radius, double height)
	{
		super(radius);
		this .height=height;
	}
	Cylinder(double radius, double height, String color)
	{
		super(radius,color);
		this .height=height;
	}
	public double getheight()
	{
		return height;
	}
	public void setheight(double height)
	{
		this .height=height;
	}
	public double getvolume()
	{
		return(3.14*getradius()*getradius()*getheight());
	}
	}
	class Test
	{
		public static void main(String args[])
		{	double V, A;
			Cylinder C1= new Cylinder();
			Cylinder C2= new Cylinder(5);
			Cylinder C3= new Cylinder(5,10);
			Cylinder C4= new Cylinder(5,10, "green");
			C1.setradius(10);
			C1.setheight(11);
			V=C1.getvolume();
			A=C1.getarea();
			System.out.println("Volume is " +V);
			System.out.println("Area is " +A);


		}
	}

