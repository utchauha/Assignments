class Distance
{
	float feet;
	float feet1;
	float inch;
	float inch1;
	Distance()
	{
		System.out.println("gtf");
	}
	Distance(float feet, float feet1, float inch, float inch1)
	{
		this .feet=feet;
		this .inch=inch;
	}
	public float getfeet()
	{
		return feet;
	}
	public float getfeet1()
	{
		return feet1;
	}
	public float getinch1()
	{
		return inch1;
	}
	public float getinch()
	{
		return inch;
	}
	public void set(float feet, float feet1)
	{
		this .feet=feet;
		this .feet1=feet1;
	}
	public void set(float feet, float inch, float feet1, float inch1)
	{
		this .feet=feet1;
		this .feet1=feet1;
		this .inch=inch;
		this .inch1=inch1;
	}
	public void sum(Distance D1)
	{   float fsum, isum;
		fsum=getfeet()+D1.getfeet1();
		isum=getinch()+D1.getinch1();
		System.out.println("Fsum is " +fsum);
		System.out.println("Inch sum is" +isum);

	}
	}
	class DistanceDemo
	{
		public static void main(String args[])
		{
			Distance D2= new Distance();
			Distance D3= new Distance();
			D2.set(5,6,7,8);
			D3.set(9,10,11,12);
			D2.sum(D3);
		}
	}

