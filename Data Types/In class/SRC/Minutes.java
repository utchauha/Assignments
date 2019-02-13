class Minutes
{
	public static void main(String args[])
	{
	double minutesInayear=60*24*365;
	double minutes=5665;
	long years=(long)(minutes/minutesInayear);
	int months=(int)(minutes/60/2/365);
	int days=(int)(minutes/60/24)%365;
	System.out.println("Minutes are" +minutes);
	System.out.println("Years are" +years);
	System.out.println("Months are" +months);
	System.out.println("Days are" +days);
	

}
}