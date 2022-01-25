package inheritance;

public class MountainBike extends Bicycle{
	
	public int height;
	public int seatheight;
    public int  adjustedheight;
	
	
	public MountainBike(int gear,int speed,int height,int seatheight) {
		super(gear,speed);
		this.height = height;
		this.seatheight=seatheight;
	}
	
	public void setHeight(int height)
	{
		  adjustedheight= seatheight+height;
		  System.out.println("The adjusted seat height= "+ adjustedheight);
	}
	
	public String toString()
	{
		return "[  height = "+height+" Adjusted height = "+ adjustedheight+" ]";
	}

}
