import java.util.Scanner;
class Vehicle
{
	void display()
	{
		System.out.println("This is a vehicle");
	}

}
class Car extends Vehicle
{
	void display()
	{
		System.out.println("This is a car");
	}
}
class Bike extends Vehicle
{
	void display()
	{
		System.out.println("This is a bike");
	}
}
class VehicleTest
{
	public static void main(String args[])
	{
		int N;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the no of tyres");
		N= x.nextInt();
		switch(N)
		{
			case 2:
			{
				Bike B= new Bike();
				B.display();
			}
			break;
			case 4:
			{
				Car C= new Car();
				C.display();
			}break;
			default:
			{
				System.out.println("Wrong input");
			}


		}	
	}	
}
	
