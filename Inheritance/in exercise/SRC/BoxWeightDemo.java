import java.util.Scanner;
class Box1
{
	float width;
	float height;
	float depth;
	Box1()
	{
		width=0;
		height=0;
		depth=0;
	}
	Box1(float width, float height, float depth)
	{
		this .width=width;
		this .height=height;
		this .depth=depth;
	}
	Box1(float width, float height)
	{
		this .width=width;
		this .height=height;
	}
	float getwidth()
	{
		return width;
	}
	float getheight()
	{
		return height;
	}
	float getdepth()
	{
		return depth;
	}
	void setdimensions(float width, float height, float depth)
	{
		this .width=width;
		this .height=height;
		this .depth=depth;
	}
	void display()
	{
		float volume;
		volume=getwidth()*getheight()*getdepth();
		System.out.println("Volume is " +volume);
		
	}

}
class BoxWeight extends Box1
{
	float weight;
	BoxWeight()
	{
		super();
	}
	BoxWeight(float width, float height, float depth, float weight)
	{
		super(width, height,depth);
		this .weight=weight;
	}
	BoxWeight(float width, float height, float weight)
	{
		super(width, height);
		this .weight=weight;
	}
	float getweight()
	{
		return weight;
	}
	void setdimensions(float width, float height, float depth, float weight)
	{
		super.setdimensions(width, height, depth);
		this .weight=weight;
	}
	void display()
	{
		weight=getwidth()*getheight()*getdepth()*getweight();
		System.out.println("weight is" +weight);
	}

}
class BoxWeightDemo
{
	public static void main(String args[])
	{	float w;
		float h;
		float d;
		float we;

		Scanner x= new Scanner(System.in);

		BoxWeight B1= new BoxWeight();
		BoxWeight B2= new BoxWeight(45,12,25,56);
		Box1 B3= new Box1();
		System.out.println("Enter the value of width, height, depth, weight ");
		w=x.nextFloat();
		h=x.nextFloat();
		d=x.nextFloat();
		we=x.nextFloat();
		B1.setdimensions(w,h,d,we);
		B1.display();
		B3.setdimensions(w,h,d);
		B3.display();



	}
}