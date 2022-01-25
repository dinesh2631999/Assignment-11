package inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb=new MountainBike(4,60,120,30);
		mb.applyBrake(20);
		mb.speedup(10);
		mb.setHeight(mb.height);
		System.out.println(mb);

	}

}
