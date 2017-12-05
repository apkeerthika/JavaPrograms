public class Flight
{
	 int passengers = 0;
	 int seats = 150;

	public boolean hasRoom(Flight f2)
	{
		int total = this.passengers + f2.passengers;
		return total<=seats;
	}

	public Flight createNewWithBoth(Flight f2)
	{
		Flight newFlight = new Flight();
		newFlight.seats = seats;
		newFlight.passengers = passengers + f2.passengers;

		return newFlight;
	}
	public static void main(String[] args)
	{
		Flight lax1 = new Flight();
		Flight lax2 = new Flight();

		Flight lax3 = null;

		if(lax1.hasRoom(lax2))
			System.out.println(lax1.hasRoom(lax2));

		lax3 = lax1.createNewWithBoth(lax2);
			System.out.println(lax3);

		if(lax3!=null)
			System.out.println("Flights Combined");

	}
}