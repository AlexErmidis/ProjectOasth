
public class Fine {

	String date_time;
	User owner;
	double price;	
	String  inspector_num;
	int bus;
	boolean paid;
	
	public Fine(String date_time, User owner, String inspector_num, int bus, boolean paid) {
		this.date_time = date_time;
		this.owner = owner;
		this.price = countPrice(owner.getPass_no);
		this.inspector_num = inspector_num;
		this.bus = bus;
		this.paid = paid;
	}

	public void finePaid()
	{
		paid = false;
	}
	
	public double countPrice(String passenger_pass_num)
	{
		if(passenger_pass_num != null)
		{
			price = 15;
		}
		else
		{
			price = 30;
		}
		return price;
	}
}
