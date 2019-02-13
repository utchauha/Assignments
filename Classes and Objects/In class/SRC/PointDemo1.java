class PointDemo1
{	public static void main(String args[])
	{
	Point P2= new Point();
	Point P3= new Point();
	Point P1= new Point();
	double d1;
	P2.setx1(5);
	P2.sety1(7);
	P3.setx2(9);
	P3.sety2(10);
	d1=P1.Distance(P2,P3);
	System.out.println("Distance is" +d1);
	}
}