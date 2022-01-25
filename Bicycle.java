package inheritance;

public class Bicycle {

	public int  gear;
	public int speed;
	public int value;
	public int brake;
	public int speedup;
	
	public Bicycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	
	public void applyBrake(int value)
	{
		brake=speed-value;
		System.out.println("After brake applied = "+brake);
	}
	
	public void speedup(int value)
	{
		speedup=speed+value;
		System.out.println("After speedup = "+speedup);
	}
	
	public String toString()
	{
		return "[ gear = "+gear+" speed = "+speed+" ]";
	}
	
}
